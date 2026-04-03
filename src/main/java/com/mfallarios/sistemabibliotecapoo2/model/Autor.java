package com.mfallarios.sistemabibliotecapoo2.model;

public class Autor {
    private String idAutor;
    private String nombre;
    private String nacionalidad;

    public Autor(String idAutor, String nombre, String nacionalidad) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String obtenerBiografia() {
        return nombre + " de nacionalidad " + nacionalidad;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdAutor() {
        return idAutor;
    }
}