package com.mfallarios.sistemabibliotecapoo2.model;

public class Libro extends Recurso {
    private String autor;

    public Libro(String codigo, String titulo, String autor) {
        super(codigo, titulo); // Esto llama al constructor de Recurso
        this.autor = autor;
    }

    @Override
    public String obtenerTipo() {
        return "El libro lo escribió: " + autor;
    }
}