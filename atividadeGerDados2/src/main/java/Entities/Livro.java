package Entities;

public class Livro {
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



}
