package com.example.demo.mappers;

import com.example.demo.dtos.ContaDTO;
import com.example.demo.models.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}