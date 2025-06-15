
package com.eduvoice.api.controller;

import com.eduvoice.api.dto.NumeroDTO;
import com.eduvoice.api.service.NumeroService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author Paico Uchuya Braighton Maxwell */

@RestController
@RequestMapping("api/numeros")
public class NumeroController {
    
    private final NumeroService numeroService;

    public NumeroController(NumeroService numeroService) {
        this.numeroService = numeroService;
    }
    
    @GetMapping("/lista-aleatoria")
    public ResponseEntity<List<NumeroDTO>> obtenerListaAleatoria() {
        List<NumeroDTO> lista = numeroService.obtenerTodosAleatorios();
        return ResponseEntity.ok(lista);
    }
}
