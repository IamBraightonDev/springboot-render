
package com.eduvoice.api.repository;

import com.eduvoice.api.model.Palabra;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/** @author Paico Uchuya Braighton Maxwell */

@Repository
public interface PalabraRepository extends CrudRepository<Palabra, Integer> {

    List<Palabra> findAllByCategoria(String categoria);
    
}
