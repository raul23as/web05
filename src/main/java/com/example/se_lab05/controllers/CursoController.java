package com.example.se_lab05.controllers;

import com.example.se_lab05.model.entities.Curso;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.CursoService;
import services.impl.CursoServiceImpl;

import java.io.IOException;

@WebServlet(name = "CursoController", urlPatterns = {"/cController", "/sCurso", "/cursoController"})
public class CursoController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
              throws ServletException, IOException {
        Curso curso = new Curso();
        curso.setCodigo(request.getParameter("txtCodigo"));
        curso.setNombre(request.getParameter("txtNombre"));
        curso.setCredito(Integer.parseInt(request.getParameter("txtCreditos")));

        System.out.println(curso);
        CursoService servicio = new CursoServiceImpl();

        String accion = request.getParameter("accion");
        switch (accion){
            case "insertar": servicio.grabar(curso); break;
            case "actualizar": servicio.actualizar(curso); break;
            case "eliminar": servicio.borrar(curso.getCodigo()); break;
        }
    }
}
