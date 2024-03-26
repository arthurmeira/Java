import Membro.Professor;
import Membro.Aluno;

public class Mostrar {
    public static void main(String args[]){
        Professor professor = new Professor("Lucas", 34, 552, 3000);
        Aluno aluno = new Aluno("Pedro", 16, 626, 7.6);

        professor.MostrarDetalhes();
        System.out.printf("\n--------------------");
        aluno.MostrarDetalhes();
        System.out.printf("\n--------------------");
    }
}
