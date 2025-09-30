package com.example.se_lab05.model.entities;

public class Curso {
    private String codigo;
    private int credito;
    private String nombre;

    public Curso() {
    }

    public Curso(String codigo,  String nombre, int credito) {
        this.codigo = codigo;
        this.credito = credito;
        this.nombre = nombre;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", credito=" + credito +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public Object getCreditos() {
        return null;
    }
}
