
package com.eduvoice.api.service;

import com.eduvoice.api.dto.FraseDTO;
import java.util.List;

/** @author Paico Uchuya Braighton Maxwell */

public interface FraseService {
    
    List<FraseDTO> obtenerTodasAleatoriasPorCategoria(String categoria);
    
}
