package com.example.exercicio13.repositorio;

import com.example.exercicio13.entidade.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepositorio extends JpaRepository<Jogador, Long> {
}