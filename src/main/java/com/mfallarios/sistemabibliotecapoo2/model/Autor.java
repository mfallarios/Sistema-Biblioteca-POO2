package com.mfallarios.sistemabibliotecapoo2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity//indica que es una tabla
@Table(name = "autores")//nombre de la tabla
@Data//(Lombok)
@NoArgsConstructor
@AllArgsConstructor//reemplaza a los constructores
public class Autor {

    @Id
    private String idAutor;
    private String nombre;
    private String nacionalidad;

    public String obtenerBiografia() {
        return nombre + " de nacionalidad " + nacionalidad;
    }

}