
package com.eduvoice.api.repository;

import com.eduvoice.api.model.Numero;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/** @author Paico Uchuya Braighton Maxwell */

@Repository
public interface NumeroRepository extends CrudRepository<Numero, Integer> {

    List<Numero> findAll();
    
}
