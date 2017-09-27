package com.rramos.paginasamarillasapp.models;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.repositories.EmpresaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by RODRIGO on 23/09/2017.
 */

public class EmpresaAdapter extends RecyclerView.Adapter<EmpresaAdapter.EmpresaViewHolder> implements Filterable{



    private List<Empresa> empresas ;
    private List<Empresa> empresasFilter;
    private CustomFilter eFilter;



    public EmpresaAdapter(List<Empresa> empresas) {
        this.empresas = empresas;

        this.empresasFilter = new ArrayList<>();
        this.empresasFilter.addAll(empresas);
        this.eFilter = new CustomFilter(EmpresaAdapter.this);

    }

    @Override
    public EmpresaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_empresas,parent,false);
        return  new EmpresaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EmpresaViewHolder holder, int position) {

        Empresa empresa= empresas.get(position);
        holder.nombre_empresa.setText(empresa.getNombre());
        holder.info_descripcion.setText(empresa.getInfo());
        holder.direccion_empresa.setText(empresa.getDireccion());
        holder.telefono_empresa.setText(String.valueOf(empresa.getTelefono()));
        holder.foto_empresa.setImageResource(empresa.getLogo());
    }


    @Override
    public int getItemCount() {
        return empresas.size();
    }

    @Override
    public Filter getFilter() {
        return eFilter;
    }

    public class EmpresaViewHolder extends RecyclerView.ViewHolder {
        public TextView nombre_empresa,info_descripcion,direccion_empresa,telefono_empresa;
        public ImageView foto_empresa;
        public EmpresaViewHolder(View itemView) {
            super(itemView);
            nombre_empresa = (TextView)itemView.findViewById(R.id.nombre_empresa);
            info_descripcion = (TextView)itemView.findViewById(R.id.info_descripcion);
            direccion_empresa = (TextView)itemView.findViewById(R.id.direccion_empresa);
            telefono_empresa = (TextView)itemView.findViewById(R.id.telefono_empresa);
            foto_empresa = (ImageView)itemView.findViewById(R.id.foto_empresa);

        }
    }

    public class CustomFilter extends  Filter{

        private EmpresaAdapter empresaAdapter;

        private CustomFilter(EmpresaAdapter empresaAdapter){
            super();
            this.empresaAdapter = empresaAdapter;
        }

        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            empresasFilter.clear();
            final FilterResults resultados= new FilterResults();
            if (charSequence.length()==0){
                empresasFilter.addAll(empresas);

            }else{
                final String modeloFilter= charSequence.toString().toLowerCase().trim();
                for (final Empresa empresa: empresas
                     ) {
                    if (empresa.getRubro().contains(modeloFilter)){
                        empresasFilter.add(empresa);
                    }

                }
            }
            resultados.values = empresasFilter;
            resultados.count = empresasFilter.size();

            return resultados;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            this.empresaAdapter.notifyDataSetChanged();
        }
    }
}
