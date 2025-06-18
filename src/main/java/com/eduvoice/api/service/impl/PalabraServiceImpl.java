
package com.eduvoice.api.service.impl;

import com.eduvoice.api.dto.PalabraDTO;
import com.eduvoice.api.exception.RecursoNoEncontradoException;
import com.eduvoice.api.model.Palabra;
import com.eduvoice.api.repository.PalabraRepository;
import com.eduvoice.api.service.PalabraService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Paico Uchuya Braighton Maxwell */

@Service
public class PalabraServiceImpl implements PalabraService {
    
    private final PalabraRepository palabraRepository;
    
    @Autowired
    public PalabraServiceImpl(PalabraRepository palabraRepository) {
        this.palabraRepository = palabraRepository;
    }

    @Override
    public List<PalabraDTO> obtenerTodasAleatoriasPorCategoria(String categoria) {
        List<Palabra> palabras = palabraRepository.findAllByCategoria(categoria);
        if (palabras.isEmpty()) {
            throw new RecursoNoEncontradoException("No se encontraron palabras para la categoría: " + categoria);
        }
        return palabras.stream()
                .map(p -> new PalabraDTO(p.getValor(), p.getCategoria()))
                .collect(Collectors.toList());
    }
}
