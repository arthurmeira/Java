import Entities.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 123, 3000.00, 5);
        Estagiario estagiario = new Estagiario("Lucas", 433, 1200.00, 3);
        Gerente gerente = new Gerente("Arthur", 342, 6000.00, 10);

        desenvolvedor.Mostrar();
        estagiario.Mostrar();
        gerente.Mostrar();

    }

}
