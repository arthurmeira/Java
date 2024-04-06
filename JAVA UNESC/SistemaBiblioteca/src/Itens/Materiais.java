package Itens;

public class Materiais {
    private String titulo;
    private String autor;
    private String categoria;
    private int ano;

    public Materiais(String titulo, String autor, String categoria, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ano = ano;
    }

    public Materiais() {
        // Construtor padrão vazio
    }

    public void MostrarDados() {
        String mostrar = "\nDados: ";
        mostrar += "\nCategoria: " + getCategoria();
        mostrar += "\nTitulo: " + getTitulo();
        mostrar += "\nAutor: " + getAutor();
        mostrar += "\nAno: " + getAno();
        System.out.println(mostrar);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
