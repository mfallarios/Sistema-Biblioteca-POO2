package com.mfallarios.sistemabibliotecapoo2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "libros")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Libro extends Recurso implements IPrestable {

    private int numPaginas;

    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

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