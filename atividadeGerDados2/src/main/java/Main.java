import Entities.Livro;
import Entities.Livraria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        // Adiciona livros ao acervo
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 123456789, 1, 29.90);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 123456789, 1, 29.90);
        Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 987654321, 2, 39.90);
        Livro livro4 = new Livro("O Cortiço", "Aluísio Azevedo", 112233445, 3, 25.50);
        Livro livro5 = new Livro("A Moreninha", "Joaquim Manuel de Macedo", 223344556, 1, 19.90);
        Livro livro6 = new Livro("Iracema", "José de Alencar", 334455667, 2, 22.90);
        Livro livro7 = new Livro("O Guarani", "José de Alencar", 445566778, 1, 14.90);

        livraria.adicionar(livro1);
        livraria.adicionar(livro2);
        livraria.adicionar(livro3);
        livraria.adicionar(livro4);
        livraria.adicionar(livro5);
        livraria.adicionar(livro6);
        livraria.adicionar(livro7);

        // Menu
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Listar todos os livros");
            System.out.println("2. Remover livro pelo título");
            System.out.println("3. Calcular valor total do acervo");
            System.out.println("4. Pesquisar livros por gênero");
            System.out.println("5. Pesquisar livros por intervalo de preço");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (escolha) {
                case 1:
                    livraria.listar();
                    break;
                case 2:
                    System.out.print("Digite o título do livro a ser removido: ");
                    String titulo = scanner.nextLine();
                    livraria.remover(titulo);
                    break;
                case 3:
                    livraria.valorAcervo();
                    break;
                case 4:
                    System.out.print("Digite o gênero para pesquisa: ");
                    int genero = scanner.nextInt();
                    livraria.pesquisar(genero);
                    break;
                case 5:
                    System.out.print("Digite o valor inicial: ");
                    double valorInicial = scanner.nextDouble();
                    System.out.print("Digite o valor final: ");
                    double valorFinal = scanner.nextDouble();
                    livraria.pesquisar_valor(valorInicial, valorFinal);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (escolha != 6);

        scanner.close();
    }
}
