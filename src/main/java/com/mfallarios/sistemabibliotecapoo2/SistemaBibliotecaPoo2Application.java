package com.mfallarios.sistemabibliotecapoo2;

import com.mfallarios.sistemabibliotecapoo2.model.Autor;
import com.mfallarios.sistemabibliotecapoo2.model.Libro;
import com.mfallarios.sistemabibliotecapoo2.repository.AutorRepository;
import com.mfallarios.sistemabibliotecapoo2.repository.LibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SistemaBibliotecaPoo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SistemaBibliotecaPoo2Application.class, args);
    }

    @Bean
    CommandLineRunner init(LibroRepository libroRepo, AutorRepository autorRepo) {
        return args -> {
            // 1. Creamos un Autor
            Autor autor1 = new Autor("A01", "Gabriel García Márquez", "Colombiana");
            autorRepo.save(autor1); // El repositorio lo guarda en la tabla autores

            // 2. Creamos un Libro y le pasamos el autor
            Libro libro1 = new Libro("L01", "Cien años de soledad", "Editorial Sudamericana", 1967, autor1, 471);
            libroRepo.save(libro1); // El repositorio lo guarda en la tabla libros

            System.out.println("------------------------------------------");
            System.out.println("¡BASE DE DATOS INICIADA EXITOSAMENTE!");
            System.out.println("Libro guardado: " + libroRepo.findAll().get(0).getTitulo());
            System.out.println("------------------------------------------");

            System.out.println("Lista de libros en la BD: " + libroRepo.findAll());
        };
    }
}