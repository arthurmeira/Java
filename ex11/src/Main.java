//Elabore um algoritmo que leia 5 números, e imprima quantos são pares e quantos são ímpares.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int par = 0, impar = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                par +=1;
            } else {
                impar +=1;
            }
        }
        System.out.println("Total de par: " + par);
        System.out.println("Total de ímpar: " + impar);
    }
}