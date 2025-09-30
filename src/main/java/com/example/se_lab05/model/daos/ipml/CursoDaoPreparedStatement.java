package com.example.se_lab05.model.daos.ipml;

import com.example.se_lab05.model.daos.CursoDao;
import com.example.se_lab05.model.entities.Curso;

import java.util.List;

public class CursoDaoPreparedStatement implements CursoDao {
    @Override
    public List<Curso> findByRangeCreditos(int min, int max) {
        return List.of();
    }

    @Override
    public List<Curso> findByNombre(String nombre) {
        return List.of();
    }

    @Override
    public void create(Curso curso) {

    }

    @Override
    public Curso find(String id) {
        return null;
    }

    @Override
    public List<Curso> findAll() {
        return List.of();
    }

    @Override
    public void update(Curso curso) {

    }

    @Override
    public void delete(String id) {

    }
}
