package com.example.se_lab05.model.daos;

import com.example.se_lab05.model.entities.Administrador;

public interface AdministradorDao {
    public Administrador validar(String user, String password);

}
