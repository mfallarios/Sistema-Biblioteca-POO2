package com.mfallarios.sistemabibliotecapoo2.model;

public class Revista extends Recurso {
    private int nroEdicion;

    public Revista(String codigo, String titulo, int nroEdicion) {
        super(codigo, titulo);
        this.nroEdicion = nroEdicion;
    }

    @Override
    public String obtenerTipo() {
        return "Revista Edición Nro: " + nroEdicion;
    }
}