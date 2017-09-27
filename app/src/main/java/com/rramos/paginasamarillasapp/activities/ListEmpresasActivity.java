package com.rramos.paginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.models.Empresa;
import com.rramos.paginasamarillasapp.models.EmpresaAdapter;
import com.rramos.paginasamarillasapp.repositories.EmpresaRepository;

import java.util.ArrayList;
import java.util.List;

public class ListEmpresasActivity extends AppCompatActivity {

    private RecyclerView recycler_empresas;
    private RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_empresas);

        recycler_empresas=(RecyclerView)findViewById(R.id.recycler_empresas);
        recycler_empresas.setHasFixedSize(true);
        recycler_empresas.setLayoutManager(new LinearLayoutManager(this));


        EmpresaRepository empresaRepository = EmpresaRepository.getInstance();

        List<Empresa> empresas = empresaRepository.getEmpresas();
        final EmpresaAdapter empresaAdapter = new EmpresaAdapter(empresas);

        Log.d("tag",String.valueOf(empresas.size()));
        /*
        adapter = new EmpresaAdapter(empresas,this);
        recycler_empresas.setAdapter(adapter);*/

        recycler_empresas.setAdapter(empresaAdapter);
        empresaAdapter.getFilter().filter("educacion");
    }
}
