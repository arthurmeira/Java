//Elabore um algoritmo que leia 5 números, e imprima o percentual de números pares informados.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, percentual, par = 0, percent;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                par +=1;
            }
        }
        percentual = (par * 100) / 5;
        System.out.println("Total de par: " + par);
        System.out.println("Percentual de numeros pares: " + percentual + "%");
    }
}