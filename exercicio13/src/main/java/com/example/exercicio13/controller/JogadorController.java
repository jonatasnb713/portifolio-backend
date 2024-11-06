package com.example.exercicio13.controller;

import com.example.exercicio13.dtos.JogadorDTO;
import com.example.exercicio13.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<?> criarJogador(@RequestBody JogadorDTO jogadorDTO) {
        try {
            JogadorDTO jogadorCriado = jogadorService.criarJogador(jogadorDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(jogadorCriado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores() {
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        return ResponseEntity.ok(jogadores);
    }
}