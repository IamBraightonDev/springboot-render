
package com.eduvoice.api.service.impl;

import com.eduvoice.api.dto.FraseDTO;
import com.eduvoice.api.exception.RecursoNoEncontradoException;
import com.eduvoice.api.model.Frase;
import com.eduvoice.api.repository.FraseRepository;
import com.eduvoice.api.service.FraseService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Paico Uchuya Braighton Maxwell */

@Service
public class FraseServiceImpl implements FraseService {
    
    private final FraseRepository fraseRepository;
    
    @Autowired
    public FraseServiceImpl(FraseRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }

    @Override
    public List<FraseDTO> obtenerTodasAleatoriasPorCategoria(String categoria) {
        List<Frase> frases = fraseRepository.findAllByCategoria(categoria);
        if (frases.isEmpty()) {
            throw new RecursoNoEncontradoException("No se encontraron frases para la categoría: " + categoria);
        }
        return frases.stream()
                .map(f -> new FraseDTO(f.getValor(), f.getCategoria()))
                .collect(Collectors.toList());
    }
}
