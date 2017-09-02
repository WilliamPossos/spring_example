/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.dto;

import hello.data.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author possos
 */
public class AutorDTO {

    private Integer id;
    private String nombre;
    private String identificacion;
    /*Lista de libros relacionados al mismo autor*/
    Libro libro;

    public AutorDTO(Integer id, String nombre, String identificacion, Libro libro) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.libro = libro;
    }

    public AutorDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

        

}
