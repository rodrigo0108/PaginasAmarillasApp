package com.rramos.paginasamarillasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.repositories.EmpresaRepository;


public class MainActivity extends AppCompatActivity {

    private EditText get_empresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        get_empresa = (EditText)findViewById(R.id.get_empresa);

//        empresaRepository.AgregarEmpesas();
    }

    public void buscarEmpresa(View view) {

        Intent intent=new Intent(this, ListEmpresasActivity.class);
        startActivity(intent);
    }
}
