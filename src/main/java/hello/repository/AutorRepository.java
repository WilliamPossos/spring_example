/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.repository;

import hello.data.Autor;
import hello.data.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author possos
 */
public interface AutorRepository extends CrudRepository<Autor, Integer> {

    @Query("SELECT a FROM Autor a WHERE a.nombre = :name")
    public Autor findByName(@Param("name") String name);
    
}
