package com.mfallarios.sistemabibliotecapoo2.model;

public class Revista extends Recurso {
    private int nroEdicion;
    private String periodicidad;

    public Revista(String codigo, String titulo, String editorial, int anioPublicacion, int nroEdicion, String periodicidad) {
        super(codigo, titulo, editorial, anioPublicacion); // Conexión con el padre
        this.nroEdicion = nroEdicion;
        this.periodicidad = periodicidad;
    }

    @Override
    public String obtenerTipo() {
        return "Revista Edición Nro: " + nroEdicion;
    }
}