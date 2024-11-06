package com.example.exercicio13.entidade;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String apelido;
    private int habilidade;

    // Construtor sem parâmetros
    public Jogador() {}

    // Construtor com parâmetros
    public Jogador(String nome, String apelido, int habilidade) {
        this.nome = nome;
        this.apelido = apelido;
        this.habilidade = habilidade;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }
}
