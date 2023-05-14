import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero;
        double raiz;

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextFloat();
            raiz =+ Math.sqrt(numero);
            System.out.println("Raiz quadrada: " + raiz);
        }
    }
}