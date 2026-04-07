package com.mfallarios.sistemabibliotecapoo2.controller; // Verifica que tu ruta sea esta

import com.mfallarios.sistemabibliotecapoo2.model.Libro;
import com.mfallarios.sistemabibliotecapoo2.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroRepository.findAll();
    }
}
