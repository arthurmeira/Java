import Itens.Livro;

public class Main {
    public static void main(String[] args) {


        Livro livro = new Livro();
        Livro livro2 = new Livro();

        livro.setAutor("J. R. R. Tolkien");
        livro.setTitulo("Senhor dos Aneis: As Duas Torres");
        livro.setPaginas(464);
        livro.setCategoria("Livro");
        livro.setAno(1954);

        livro2.setAutor("J. R. R. Tolkien");
        livro2.setTitulo("Senhor dos Aneis: O Retorno do Rei");
        livro2.setPaginas(528);
        livro2.setCategoria("Livro");
        livro2.setAno(1955);

        livro.MostrarDados();
        livro2.MostrarDados();

    }
}