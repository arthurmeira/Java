package Itens;

public class Livro extends Itens.Materiais {

    private int paginas;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Livro() {
        // Construtor padrão vazio
    }

    public Livro(String titulo, String autor, String categoria, int ano){
        super(titulo, autor, categoria, ano);
    }
}
