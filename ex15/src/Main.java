//Elabore um algoritmo que leia um número e imprima o fatorial desse número.
//Suponha que o número lido será maior ou igual a zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, fatorial = 1, valor = 0;

        System.out.print("Digite um número maior que zero: ");
        numero = scanner.nextInt();

        for (int i = numero; i >= 2; i--) {
            fatorial *= i;
            System.out.print(i + " * ");
        }
        System.out.print("1 = " + fatorial);
    }
}