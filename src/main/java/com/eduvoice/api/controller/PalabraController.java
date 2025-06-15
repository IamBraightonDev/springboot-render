
package com.eduvoice.api.controller;

import com.eduvoice.api.dto.PalabraDTO;
import com.eduvoice.api.service.PalabraService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** @author Paico Uchuya Braighton Maxwell */

@RestController
@RequestMapping("/api/palabras")
public class PalabraController {
    
    private final PalabraService palabraService;
    
    public PalabraController(PalabraService palabraService) {
        this.palabraService = palabraService;
    }
    
    @GetMapping("/lista-aleatoria")
    public ResponseEntity<List<PalabraDTO>> obtenerListaAleatoria(@RequestParam String categoria) {
        List<PalabraDTO> lista = palabraService.obtenerTodasAleatoriasPorCategoria(categoria);
        return ResponseEntity.ok(lista);
    }
}
