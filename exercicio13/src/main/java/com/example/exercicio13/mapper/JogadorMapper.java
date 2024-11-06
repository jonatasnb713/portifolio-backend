package com.example.exercicio13.mapper;

import com.example.exercicio13.dtos.JogadorDTO;
import com.example.exercicio13.entidade.Jogador;

public class JogadorMapper {
    public static Jogador toEntity(JogadorDTO dto) {
        return new Jogador(dto.getNome(), dto.getApelido(), 100); // habilidade fixa em 100
    }

    public static JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        return dto;
    }
}