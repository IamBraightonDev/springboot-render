
package com.eduvoice.api.service.impl;

import com.eduvoice.api.dto.LetraDTO;
import com.eduvoice.api.exception.RecursoNoEncontradoException;
import com.eduvoice.api.model.Letra;
import com.eduvoice.api.repository.LetraRepository;
import com.eduvoice.api.service.LetraService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Paico Uchuya Braighton Maxwell */

@Service
public class LetraServiceImpl implements LetraService {
    
    private final LetraRepository letraRepository;
    
    @Autowired
    public LetraServiceImpl(LetraRepository letraRepository) {
        this.letraRepository = letraRepository;
    }

    @Override
    public List<LetraDTO> obtenerTodasAleatorias() {
        List<Letra> letras = letraRepository.findAll();
        if (letras.isEmpty()) {
            throw new RecursoNoEncontradoException("No se encontraron letras");
        }
        return letras.stream()
                .map(l -> new LetraDTO(l.getLetra()))
                .collect(Collectors.toList());
    }
}
