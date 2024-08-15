package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] cores = { "azul", "verde", "amarelo", "vermelho"};

        while (true) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            String primeiroNome = leitor.nextLine();

            if (primeiroNome.isEmpty()) { return; };

            System.out.println("Digite seu segundo nome: ");
            String segundoNome = leitor.nextLine();

            Random gerador = new Random();
            Integer numeroAleatorio = gerador.nextInt( 10, 100);
            Integer indiceAleatorio = gerador.nextInt(cores.length);

            String cor = cores[indiceAleatorio];
            System.out.println(cor);
        }
    }
}