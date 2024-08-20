import Entities.Livro;
import Entities.Livraria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 123456789, 1, 29.90);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 987654321, 1, 39.90);

        livraria.adicionar(livro1);
        livraria.adicionar(livro2);
        livraria.listar();
        livraria.pesquisar(123456789);
    }
}