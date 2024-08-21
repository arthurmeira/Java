package Entities;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Livraria  {
    private ArrayList<Livro> livros;
    private String Titulo;
    private String Autor;
    private int Isbn;
    private int Genero;
    private double Preco;
    private int total_pesquisa = 0;
    private double total_acervo = 0;

    public Livraria  (String Titulo, String Autor, int Isbn, int Genero, double Preco) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Isbn = Isbn;
        this.Genero = Genero;
        this.Preco = Preco;
        this.livros = new ArrayList<>();
    }

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void Mostrar(){
        String dados = "\n-----------------";
        dados += "\nTitulo: " + Titulo;
        dados += "\nAutor: " + Autor;
        dados += "\nISBN: " + Isbn;
        dados += "\nGenero: " + Genero;
        dados += "\nPreco: " + Preco;
        System.out.println(dados);
    }

    public void adicionar(Livro livro){
        this.livros.add(livro);
    }

    public void remover(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(titulo)) {
                livros.remove(i);
                i--;
            }
        }
    }

    public void listar(){
        for (Livro livro : livros) {
            livro.Mostrar();
        }
    }

    public void valorAcervo() {
        for (Livro livro : livros) {
            total_acervo += livro.getPreco();
        }

        DecimalFormat df = new DecimalFormat("#.00");
        String precoFormatado = df.format(total_acervo);
        System.out.println("\n\nTotal acervo R$" + precoFormatado);
    }

    public void pesquisar(int genero) {
        for (Livro livro : livros) {
            if (livro.getGenero() == genero) {
                livro.Mostrar();
                total_pesquisa+=1;
            }
        }
        System.out.println("-----------------");
        System.out.println("\nTotal de registros: " + total_pesquisa);
    }

    public void pesquisar_valor(double valor_inicial, double valor_final) {
        for (Livro livro : livros) {
            if (livro.getPreco() > valor_inicial && livro.getPreco() < valor_final){
                livro.Mostrar();
                total_pesquisa+=1;
            }
        }
        System.out.println("-----------------");
        System.out.println("\nTotal de registros: " + total_pesquisa);
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getIsbn() {
        return Isbn;
    }

    public void setIsbn(int isbn) {
        Isbn = isbn;
    }

    public int getGenero() {
        return Genero;
    }

    public void setGenero(int genero) {
        Genero = genero;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }



}