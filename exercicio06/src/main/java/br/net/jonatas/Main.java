package br.net.jonatas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);

        cinema.adicionarFilme(new Filme("Homem Aranha", 25.0, 12));
        cinema.adicionarFilme(new Filme("Batman", 30.0, 14));
        cinema.adicionarFilme(new Filme("O Exorcista", 20.0, 18));
        cinema.adicionarFilme(new Filme("Toy Story", 15.0, 0));
        cinema.adicionarFilme(new Filme("Velozes e Furiosos", 22.0, 16));

        while (true) {
            try {
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = scanner.nextLine();
                Filme filmeEscolhido = cinema.buscarFilme(nomeFilme);
                if (filmeEscolhido == null) {
                    throw new Exception("O filme não está disponível!");
                }

                System.out.println("Qual assento você deseja?");
                String assentoEscolhido = scanner.nextLine();
                if (!cinema.verificarAssentoDisponivel(assentoEscolhido)) {
                    throw new Exception("O assento não está mais disponível!");
                }

                System.out.println("Qual o seu nome?");
                String nomeCliente = scanner.nextLine();

                System.out.println("Qual a sua idade?");
                int idadeCliente = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);
                if (cliente.getIdade() < filmeEscolhido.getIdadeMinima()) {
                    throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
                }

                Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assentoEscolhido);
                cinema.venderIngresso(ingresso);

                System.out.println("Ingresso vendido com sucesso! " + ingresso);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("\nDeseja realizar outra compra? (s/n)");
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }
        scanner.close();
    }
}