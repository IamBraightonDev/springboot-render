
package com.eduvoice.api.repository;

import com.eduvoice.api.model.Frase;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/** @author Paico Uchuya Braighton Maxwell */

@Repository
public interface FraseRepository extends CrudRepository<Frase, Integer> {
    
    @Query(value = "EXEC SP_ObtenerFrasesPorCategoria :categoria", nativeQuery = true)
    List<Frase> encontrarTodasPorCategoria(@Param("categoria") String categoria);
    
}
