package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Que amvientação você prefere?");
        System.out.println("1 - Sci fi");
        System.out.println("2 - Medieval");
        Integer opcao_ambientacao = leitor.nextInt();

        System.out.println("Que gênero você prefere?");
        System.out.println("1 - Comédia");
        System.out.println("2 - Drama");
        Integer opcao_genero = leitor.nextInt();

        if (opcao_genero == 1 && opcao_ambientacao == 1) {
            System.out.println("Homens de Preto");       }
        if (opcao_genero == 2 && opcao_ambientacao == 1) {
            System.out.println("Arrival");       }
        if (opcao_genero == 1 && opcao_ambientacao == 2) {
            System.out.println("Sherk");       }
        if (opcao_genero == 2 && opcao_ambientacao == 2) {
            System.out.println("Gladiador");       }
    }
}