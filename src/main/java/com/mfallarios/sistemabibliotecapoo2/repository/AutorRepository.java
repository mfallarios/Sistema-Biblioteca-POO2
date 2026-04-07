package com.mfallarios.sistemabibliotecapoo2.repository;

import com.mfallarios.sistemabibliotecapoo2.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String> {
}