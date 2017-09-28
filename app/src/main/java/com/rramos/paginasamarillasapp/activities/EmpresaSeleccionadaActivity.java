package com.rramos.paginasamarillasapp.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.models.Empresa;

public class EmpresaSeleccionadaActivity extends AppCompatActivity {

    private TextView info_texto,nombre_texto,direccion_texto,telefono_texto;
    private ImageView foto_texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa_seleccionada);
        /*String nombre= getIntent().getStringExtra("nombre");*/
        final Empresa empresa = (Empresa) getIntent().getSerializableExtra("nombree");

        info_texto =(TextView)findViewById(R.id.info_texto);
        nombre_texto=(TextView)findViewById(R.id.nombre_texto);
        direccion_texto=(TextView)findViewById(R.id.direccion_texto);
        telefono_texto=(TextView)findViewById(R.id.telefono_texto);
        foto_texto=(ImageView)findViewById(R.id.foto_texto) ;
        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);


        info_texto.setText(empresa.getInfo());
        nombre_texto.setText(empresa.getNombre());
        direccion_texto.setText(empresa.getDireccion());
        telefono_texto.setText(String.valueOf(empresa.getTelefono()));
        foto_texto.setImageResource(empresa.getLogo());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_website:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(empresa.getUrl())));
                        break;
                    case R.id.menu_email:
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_EMAIL, empresa.getCorreo());
                        intent.putExtra(Intent.EXTRA_SUBJECT, empresa.getNombre());
                        intent.putExtra(Intent.EXTRA_TEXT, "Contenido");

                        startActivity(Intent.createChooser(intent, "Enviando Email"));
                        break;
                    case R.id.menu_sms:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", String.valueOf(empresa.getTelefono()), null)));
                        break;
                    case R.id.menu_compartir:
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, empresa.getRubro());
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);
                        break;
                    case R.id.menu_telefono:
                        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", String.valueOf(empresa.getTelefono()), null)));

                        break;
                }
                return true;
            }
        });




    }
}
