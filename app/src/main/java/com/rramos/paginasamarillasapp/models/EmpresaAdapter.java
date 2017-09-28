package com.rramos.paginasamarillasapp.models;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.activities.EmpresaSeleccionadaActivity;
import com.rramos.paginasamarillasapp.activities.ListEmpresasActivity;
import com.rramos.paginasamarillasapp.repositories.EmpresaRepository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by RODRIGO on 23/09/2017.
 */

public class EmpresaAdapter extends RecyclerView.Adapter<EmpresaAdapter.EmpresaViewHolder>  {


    private List<Empresa> empresas;
    private Context context;



    public static class EmpresaViewHolder extends RecyclerView.ViewHolder {

        private final CardView cardView;
        public TextView nombre_empresa, direccion_empresa, telefono_empresa;
        public ImageView foto_empresa;

        public EmpresaViewHolder(View itemView) {
            super(itemView);
            nombre_empresa = (TextView) itemView.findViewById(R.id.nombre_empresa);
            direccion_empresa = (TextView) itemView.findViewById(R.id.direccion_empresa);
            telefono_empresa = (TextView) itemView.findViewById(R.id.telefono_empresa);
            foto_empresa = (ImageView) itemView.findViewById(R.id.foto_empresa);
            cardView=(CardView)itemView.findViewById(R.id.card_view);

        }
    }

    public EmpresaAdapter(List<Empresa> empresas,Context context) {
        this.empresas = empresas;
        this.context = context;

    }

    @Override
    public EmpresaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_empresas, parent, false);
        return new EmpresaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EmpresaViewHolder holder, int position)     {

        final Empresa empresa = empresas.get(position);
        holder.nombre_empresa.setText(empresa.getNombre());
        holder.direccion_empresa.setText(empresa.getDireccion());
        holder.telefono_empresa.setText(String.valueOf(empresa.getTelefono()));
        holder.foto_empresa.setImageResource(empresa.getLogo());

        holder.cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               Intent intent= new Intent(context,EmpresaSeleccionadaActivity.class);
                intent.putExtra("nombree",empresa);
                context.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return empresas.size();
    }



}
