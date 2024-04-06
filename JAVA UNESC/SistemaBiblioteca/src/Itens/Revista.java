package Itens;

public class Revista extends Itens.Materiais {

    private String publico;

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }

    public Revista(String titulo, String autor, String categoria, int ano){
        super(titulo, autor, categoria, ano);
    }
}
