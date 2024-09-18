package com.example.demo;

public class CarResponse {
    private double valor;
    private String mes;

    // Construtor
    public CarResponse(double valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    // Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}