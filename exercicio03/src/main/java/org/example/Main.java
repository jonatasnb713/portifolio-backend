package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação dos barcos
        Barco barco1 = new Barco("Barco 1", 2);
        Barco barco2 = new Barco("Barco 2", 5);
        Barco barco3 = new Barco("Barco 3", 7);
        Barco barco4 = new Barco("Barco 4", 12);
        Barco barco5 = new Barco("Barco 5", 20);

        // Criação dos portos
        BasePorto portoPequeno = new PortoPequeno("Porto Pequeno");
        BasePorto portoGrande = new PortoGrande("Porto Grande");

        // Lista de barcos
        List<Barco> listaDeBarcos = new ArrayList<>();
        listaDeBarcos.add(barco1);
        listaDeBarcos.add(barco2);
        listaDeBarcos.add(barco3);
        listaDeBarcos.add(barco4);
        listaDeBarcos.add(barco5);

        // Tentativa de atracação dos barcos nos portos
        for (Barco barco : listaDeBarcos) {
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
            } else {
                portoGrande.atracarBarco(barco);
            }
        }
    }
}