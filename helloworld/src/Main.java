import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float salario = 1000f, aumento = 1.5f;

        salario = salario + (salario * 1.5f) / 100;

        for (int ano = 2006; ano <= 2022; ano++) {
            aumento = aumento * 2;
            salario = salario + (salario * aumento) / 100;
            System.out.println(ano+1 + " - " + aumento);
        }
        System.out.println("Aumento de " + aumento + "%\nSálario final de R$" + salario);
    }
}