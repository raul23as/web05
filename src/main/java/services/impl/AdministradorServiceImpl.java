package services.impl;

import com.example.se_lab05.model.daos.AdministradorDao;
import com.example.se_lab05.model.daos.ipml.DaoFactory;
import com.example.se_lab05.model.entities.Administrador;
import services.AdministradorService;
import util.Util;

public class AdministradorServiceImpl implements AdministradorService {

    private AdministradorDao dao;
    public AdministradorServiceImpl(){
        dao = DaoFactory.getAdministradorDao(Util.opc);
    }



    @Override
    public Administrador validar(String u, String p) {
        return dao.validar(u,p);
    }
}
