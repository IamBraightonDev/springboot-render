
package com.eduvoice.api.controller;

import com.eduvoice.api.dto.LetraDTO;
import com.eduvoice.api.model.Letra;
import com.eduvoice.api.service.LetraService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author Paico Uchuya Braighton Maxwell */

@RestController
@RequestMapping("api/letras")
public class LetraController {
    
    private final LetraService letraService;

    public LetraController(LetraService letraService) {
        this.letraService = letraService;
    }
    
    @GetMapping("/lista-aleatoria")
    public ResponseEntity<List<LetraDTO>> obtenerListaAleatoria() {
        List<LetraDTO> lista = letraService.obtenerTodasAleatorias();
        return ResponseEntity.ok(lista);
    }
    
}
