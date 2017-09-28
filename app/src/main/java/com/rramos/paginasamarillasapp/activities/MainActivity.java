package com.rramos.paginasamarillasapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.models.Empresa;
import com.rramos.paginasamarillasapp.repositories.EmpresaRepository;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private EditText get_empresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






//        empresaRepository.AgregarEmpesas();
    }

    public void buscarEmpresa(View view) {

        get_empresa = (EditText)findViewById(R.id.get_empresa);
        String rubro_escogido = get_empresa.getText().toString();



                Intent intent=new Intent(this, ListEmpresasActivity.class);
                intent.putExtra("rubroo",rubro_escogido);
                startActivity(intent);







    }
}
