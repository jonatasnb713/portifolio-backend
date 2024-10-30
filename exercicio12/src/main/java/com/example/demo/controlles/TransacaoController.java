package com.example.demo.controlles;

import com.example.demo.dtos.TransacaoRequestDTO;
import com.example.demo.dtos.TransacaoResponseDTO;
import com.example.demo.mappers.ContaMapper;
import com.example.demo.models.Transacao;
import com.example.demo.services.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO transacaoRequestDTO) {
        Transacao transacao = transacoesService.realizarTransacao(
                transacaoRequestDTO.origem(),
                transacaoRequestDTO.destino(),
                transacaoRequestDTO.valor()
        );

        return new TransacaoResponseDTO(
                ContaMapper.toDTO(transacao.getOrigem()),
                ContaMapper.toDTO(transacao.getDestino()),
                transacao.getValor()
        );
    }
}