package com.mfallarios.sistemabibliotecapoo2;

import com.mfallarios.sistemabibliotecapoo2.model.Autor;
import com.mfallarios.sistemabibliotecapoo2.model.Libro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaBibliotecaPoo2Application {

    public static void main(String[] args) {
        // 1. Primero creamos el objeto Autor (como lo tienes en tu diagrama)
        Autor miAutor = new Autor("A1", "Miguel de Cervantes", "Española");

        // 2. Ahora creamos el Libro con TODOS los datos nuevos:
        // Orden: codigo, titulo, editorial, año, objeto autor, paginas

        Libro miLibro = new Libro(
                "L1",
                "El Quijote",
                "Editorial Castalia",
                1605,
                miAutor,
                500
        );

        SpringApplication.run(SistemaBibliotecaPoo2Application.class, args);

        // 3. Probamos que funcione
        System.out.println(miLibro.obtenerTipo());
        System.out.println("Autor: " + miAutor.getNombre());
    }
}
