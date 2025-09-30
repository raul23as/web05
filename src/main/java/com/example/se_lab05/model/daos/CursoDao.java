package com.example.se_lab05.model.daos;

import com.example.se_lab05.model.entities.Curso;

import java.util.List;

public interface CursoDao extends EntidadDao<Curso, String> {
    public List<Curso> findByRangeCreditos(int min, int max);
    public List<Curso> findByNombre(String nombre);
}
