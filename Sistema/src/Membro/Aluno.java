package Membro;

public class Aluno extends MembroEscola {
    private double notaFinal;

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Aluno(String nome, int idade, int id, double notaFinal) {
        super(nome, idade, id);
        this.notaFinal = notaFinal;
    }

    // Sobrescrevendo mostrarDetalhes
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Nota final: " + notaFinal);

    }

}


