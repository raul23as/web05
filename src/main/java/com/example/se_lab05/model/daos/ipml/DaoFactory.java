package com.example.se_lab05.model.daos.ipml;

import com.example.se_lab05.model.daos.AdministradorDao;
import com.example.se_lab05.model.daos.CursoDao;
import util.Tipo;

public class DaoFactory {


    public static AdministradorDao getAdministradorDao(Tipo tipo){
        switch (tipo) {
            case MEM:
                return new AdministradorDaoMemory();
            case PST:
                return new AdministradorDaoPreparedStatement();
            case CST:
                return new AdministradorDaoCallableStatement();
            default:
                return null;
        }
    }
    public static CursoDao getCursoDao(Tipo tipo){
        switch (tipo){
            case MEM:
                return new CursoDaoMemory();
            case PST:
                return new CursoDaoPreparedStatement();
            case CST:
                return new CursoDaoCallableStatement();
            default:
                return null;
        }
    }
}
