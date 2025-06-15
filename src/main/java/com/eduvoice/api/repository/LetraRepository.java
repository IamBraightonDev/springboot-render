
package com.eduvoice.api.repository;

import com.eduvoice.api.model.Letra;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/** @author Paico Uchuya Braighton Maxwell */

@Repository
public interface LetraRepository extends CrudRepository<Letra, Integer> {
    
    @Query(value = "EXEC SP_ObtenerLetras", nativeQuery = true)
    List<Letra> encontrarTodasLasLetras();
    
}
