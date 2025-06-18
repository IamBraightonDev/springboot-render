
package com.eduvoice.api.service.impl;

import com.eduvoice.api.dto.NumeroDTO;
import com.eduvoice.api.exception.RecursoNoEncontradoException;
import com.eduvoice.api.model.Numero;
import com.eduvoice.api.repository.NumeroRepository;
import com.eduvoice.api.service.NumeroService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** @author Paico Uchuya Braighton Maxwell */

@Service
public class NumeroServiceImpl implements NumeroService {

    private final NumeroRepository numeroRepository;

    @Autowired
    public NumeroServiceImpl(NumeroRepository numeroRepository) {
        this.numeroRepository = numeroRepository;
    }

    @Override
    public List<NumeroDTO> obtenerTodosAleatorios() {
        List<Numero> numeros = numeroRepository.findAll();
        if (numeros.isEmpty()) {
            throw new RecursoNoEncontradoException("No se encontraron numeros");
        }
        return numeros.stream()
                .map(n -> new NumeroDTO(n.getValor(), n.getTexto()))
                .collect(Collectors.toList());
    }
}
