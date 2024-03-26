package Membro;

public class Aluno extends MembroEscola{

    private double notaFinal;

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Aluno(String nome, int idade, int id, double notaFinal){
        super(nome, idade, id);
        this.notaFinal = notaFinal;
    }

    public void MostrarDetalhes() {
        String detalhes = "\nDetalhes Membro";
        detalhes += "\nNome: " + getNome();
        detalhes += "\nIdade: " + getIdade();
        detalhes += "\nID: " + getId();
        detalhes += "\nNota Final: " + getNotaFinal();
        System.out.printf(detalhes);
    }

}
