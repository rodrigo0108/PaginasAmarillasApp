package com.rramos.paginasamarillasapp.repositories;

import android.widget.Toast;

import com.rramos.paginasamarillasapp.R;
import com.rramos.paginasamarillasapp.models.Empresa;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by RODRIGO on 20/09/2017.
 */

public class EmpresaRepository {

    private static EmpresaRepository _INSTANCE=null;

    public static EmpresaRepository getInstance(){
        if(_INSTANCE== null){
            _INSTANCE = new EmpresaRepository();
            _INSTANCE.AgregarEmpesas();
        }
        return _INSTANCE;
    }

    List<Empresa> empresas = new ArrayList<>();

    public void AgregarEmpesas()
    {
        Empresa empresa1 = new Empresa(1,3547821, R.drawable.logo_1,"restaurante","PollosPick","Mz M Lote F Las gardenias","pollospick@hotmail.com","www.pollos-com","esto es un polleria");
        Empresa empresa2 = new Empresa(1,3547821,R.drawable.logo_1,"educacion","Pamer","Mz J Los jardines","pamer@hotmail.com","www.pamer.com","esto es un polleria");

        empresas.add(empresa1);
        empresas.add(empresa2);
    }
    public List<Empresa> getEmpresas(){
        return  empresas;
    }

}
