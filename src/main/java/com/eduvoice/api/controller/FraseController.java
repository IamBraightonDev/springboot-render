
package com.eduvoice.api.controller;

import com.eduvoice.api.dto.FraseDTO;
import com.eduvoice.api.service.FraseService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/** @author Paico Uchuya Braighton Maxwell */

@RestController
@RequestMapping("/api/frases")
public class FraseController {
    
    private final FraseService fraseService;

    public FraseController(FraseService fraseService) {
        this.fraseService = fraseService;
    }
    
    @GetMapping("/lista-aleatoria")
    public ResponseEntity<List<FraseDTO>> obtenerFraseAleatoria(@RequestParam String categoria) {
        List<FraseDTO> lista = fraseService.obtenerTodasAleatoriasPorCategoria(categoria);
        return ResponseEntity.ok(lista);
    }
}
