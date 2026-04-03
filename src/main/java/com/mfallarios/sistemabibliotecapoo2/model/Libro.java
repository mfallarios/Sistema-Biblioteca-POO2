package com.mfallarios.sistemabibliotecapoo2.model;

public class Libro extends Recurso implements IPrestable {
    private Autor autor; // Lo dejamos como String por ahora para ir paso a paso
    private int numPaginas;

    // Actualizamos el constructor para que le pase los datos nuevos al padre (super)
    // El constructor debe recibir 'int anioPublicacion' para que coincida con el padre
    public Libro(String codigo, String titulo, String editorial, int anioPublicacion, Autor autor, int numPaginas) {
        super(codigo, titulo, editorial, anioPublicacion); // El error debería desaparecer aquí
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    @Override
    public String obtenerTipo() {
        return "Libro de: " + autor.getNombre();
    }

    @Override
    public void prestar() {
        this.disponible = false;
        System.out.println("El libro '" + getTitulo() + "' ha sido prestado.");
    }

    @Override
    public void devolver() {
        this.disponible = true;
        System.out.println("El libro '" + getTitulo() + "' ha sido devuelto.");
    }
}