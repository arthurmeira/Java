package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lista[] = {1,2,3,4,5,6,7,8,9,10};
        int chute, alto = lista.length - 1, baixo = 0, item = lista[7], meio = 0;

        System.out.println("A lista possui 10 números, digite um para começar o jogo: ");
        chute = sc.nextInt();

        while (baixo <= alto) {
            meio = (baixo + alto) / 2;
            int valorMeio = lista[meio];

            if (chute == item) {
                System.out.println("*********** ACERTOU! ***********");
                break;
            } else if (chute < item) {
                System.out.println("Chute baixo!");
                baixo = meio + 1;
            } else {
                System.out.println("Chute alto!");
                alto = meio - 1;
            }

            if (baixo <= alto) {
                System.out.println("Tente novamente, digite outro número: ");
                chute = sc.nextInt();
            } else {
                System.out.println("\n *********** PERDEU! ***********");
            }
        }

    }
}