package com.example.demo.services;

import com.example.demo.models.Conta;
import com.example.demo.models.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {
    private List<Conta> contas = new ArrayList<>();

    public TransacoesService() {
        // Inicialização das contas
        contas.add(new Conta("500-1", "Fulano", 1000.0));
        contas.add(new Conta("320-2", "Ciclano", 500.0));
    }

    public Conta findContaByCodigo(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }

    public Transacao realizarTransacao(String origemCodigo, String destinoCodigo, Double valor) {
        Conta origem = findContaByCodigo(origemCodigo);
        Conta destino = findContaByCodigo(destinoCodigo);

        // Verifica se a origem tem saldo suficiente
        if (origem.getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }

        // Atualiza os saldos
        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);

        return new Transacao(origem, destino, valor);
    }
}