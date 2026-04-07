package com.mfallarios.sistemabibliotecapoo2.repository;

import com.mfallarios.sistemabibliotecapoo2.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String> {
    // Esta interfaz hereda todos los métodos para guardar y buscar en la tabla Libros
}