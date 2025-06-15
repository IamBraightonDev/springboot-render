
package com.eduvoice.api.service;

import com.eduvoice.api.dto.PalabraDTO;
import java.util.List;

/** @author Paico Uchuya Braighton Maxwell */

public interface PalabraService {
    
    List<PalabraDTO> obtenerTodasAleatoriasPorCategoria(String categoria);
    
}
