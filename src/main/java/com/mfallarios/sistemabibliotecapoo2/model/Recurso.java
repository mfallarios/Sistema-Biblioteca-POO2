package com.mfallarios.sistemabibliotecapoo2.model;

// TODO: Validar que el código no sea nulo más adelante
public abstract class Recurso {
    protected String codigo;
    protected String titulo;

    public Recurso(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    // Un método abstracto para que los hijos lo implementen
    public abstract String obtenerTipo();

    public String getTitulo() {
        return titulo;
    }
}