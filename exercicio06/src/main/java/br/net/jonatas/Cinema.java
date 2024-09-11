package br.net.jonatas;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;
    private List<String> assentosDisponiveis;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        assentosDisponiveis = new ArrayList<>();
        // Preenche os assentos de A1 a F5
        char[] fileiras = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char fileira : fileiras) {
            for (int numero = 1; numero <= 5; numero++) {
                assentosDisponiveis.add(fileira + String.valueOf(numero));
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nomeFilme) {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                return filme;
            }
        }
        return null;
    }

    public boolean verificarAssentoDisponivel(String assento) {
        return assentosDisponiveis.contains(assento);
    }

    public void venderIngresso(Ingresso ingresso) {
        ingressosVendidos.add(ingresso);
        assentosDisponiveis.remove(ingresso.toString());
    }
}