package Membro;

public class Professor extends MembroEscola {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, int id, double salario) {
        super(nome, idade, id);
        this.salario = salario;
    }

    // Sobrescrevendo mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Salário: " + salario);
    }
}