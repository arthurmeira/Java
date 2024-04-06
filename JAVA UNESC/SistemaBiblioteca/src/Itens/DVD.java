package Itens;

public class DVD extends Itens.Materiais {

    private double capacidade;

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public DVD(String titulo, String autor, String categoria, int ano){
        super(titulo, autor, categoria, ano);
    }

    @Override
    public void MostrarDados() {
        super.MostrarDados();
        System.out.println("Capacidade GB: " + getCapacidade());
    }
}
