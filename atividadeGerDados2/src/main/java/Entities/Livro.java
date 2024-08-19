package Entities;


import java.util.ArrayList;

public class Livro  {
    private String Titulo;
    private String Autor;
    private int Isbn;
    private int Genero;
    private double Preco;

    public Livro  (String Titulo, String Autor, int Isbn, int Genero, double Preco) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Isbn = Isbn;
        this.Genero = Genero;
        this.Preco = Preco;


    }

    public void Mostrar(){
        String dados = "\nDados livro: ";
        dados += "\nTitulo: " + Titulo;
        dados += "\nAutor: " + Autor;
        dados += "\nISBN: " + Isbn;
        dados += "\nGenero: " + Genero;
        dados += "\nPreco: " + Preco;
        System.out.println(dados);
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

    public static class Livraria {
        private ArrayList<Livro> livros;

        public Livraria() {
            this.livros = new ArrayList<>();
        }

        public void adicionar(Livro livro){
            this.livros.add(livro);
        }

        public void listar(){
            for (Livro livro : livros) {
                livro.Mostrar();
            }
        }

        public void pesquisar(Livro livro) {
            for (livro.getGenero() == "1") {

            }
        }

    }
}
