package Membro;

public class Professor extends MembroEscola{

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, int id, double salario){
        super(nome, idade, id);
        this.salario = salario;
    }

    public void MostrarDetalhes() {
        String detalhes = "\nDetalhes Membro: ";
        detalhes += "\nNome: " + getNome();
        detalhes += "\nIdade: " + getIdade();
        detalhes += "\nID: " + getId();
        detalhes += "\nSalario: " + getSalario();
        System.out.printf("\n--------------------");
        System.out.printf(detalhes);
    }

}
