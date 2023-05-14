//Elabore um algoritmo que leia o nome, idade e sexo de 20 pessoas.
//A cada leitura, imprima o nome, se a pessoa for do sexo masculino, e tiver mais de 21 anos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, sexo;

        System.out.println("Preencha o programa a seguir: ");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\n\nDigite o nome: ");
            nome = scanner.next();

            System.out.print("Digite o Sexo (1 - Masculino / 2 - Feminino): ");
            sexo = scanner.nextInt();

            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();

            if (sexo == 1 && idade >= 21) {
                System.out.println(nome);
            }
        }
    }
}