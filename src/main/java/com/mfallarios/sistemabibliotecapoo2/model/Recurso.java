package com.mfallarios.sistemabibliotecapoo2.model;

// TODO: Validar que el código no sea nulo más adelante
public abstract class Recurso {
    protected String codigo;
    protected String titulo;
    protected String editorial;
    protected int anioPublicacion;
    protected boolean disponible = true;

    public Recurso(String codigo, String titulo, String editorial, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    // Un método abstracto para que los hijos lo implementen
    public abstract String obtenerTipo();

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
}