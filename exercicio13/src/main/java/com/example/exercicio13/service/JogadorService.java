package com.example.exercicio13.service;

import com.example.exercicio13.dtos.JogadorDTO;
import com.example.exercicio13.entidade.Jogador;
import com.example.exercicio13.mapper.JogadorMapper;
import com.example.exercicio13.repositorio.JogadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepositorio jogadorRepository;

    public JogadorDTO criarJogador(JogadorDTO jogadorDTO) {
        // Validação manual
        if (jogadorDTO.getNome() == null || jogadorDTO.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome é obrigatório.");
        }
        if (jogadorDTO.getApelido() == null || jogadorDTO.getApelido().isEmpty()) {
            throw new IllegalArgumentException("O apelido é obrigatório.");
        }

        Jogador jogador = JogadorMapper.toEntity(jogadorDTO);
        jogadorRepository.save(jogador);
        return JogadorMapper.toDTO(jogador);
    }

    public List<JogadorDTO> listarJogadores() {
        return jogadorRepository.findAll().stream()
                .map(JogadorMapper::toDTO)
                .collect(Collectors.toList());
    }
}