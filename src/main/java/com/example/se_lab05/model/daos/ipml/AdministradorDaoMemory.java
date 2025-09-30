package com.example.se_lab05.model.daos.ipml;

import com.example.se_lab05.model.daos.AdministradorDao;
import com.example.se_lab05.model.entities.Administrador;

public class AdministradorDaoMemory implements AdministradorDao {
    @Override
    public Administrador validar(String u, String p){
        Administrador administrador = null;
        if(u.equals("admin")&& p.equals("admin")){
            administrador = new Administrador();
            administrador.setNombres("juan");
            administrador.setApellidos("perez");
        }
        return administrador;
    }

}
