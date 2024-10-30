package com.example.demo.dtos;

public record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, Double valor) {}