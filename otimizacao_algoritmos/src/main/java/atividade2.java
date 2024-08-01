/*
##################################
#	 UNESC
#	 CIENCIA DA COMPUTACAO
#	 PROJETO E OTIMIZACAO DE ALGORITMOS
#	 2024/02
#	 PROF.: ALLAN FARIAS FAVARO
#	 ALUNO: Arthur Meira
##################################
*/

public class atividade2 {
    public static void main(String[] args) {

        float[] tempo = {122, 60, 163, 131, 69, 90, 120, 45, 52, 87};
        float TTA = 0;


        for (int i = 0; i < tempo.length; i++) {
            TTA += tempo[i];
        }
        System.out.println("Tempo total " + TTA);
        System.out.println("Media tempo: " + TTA / 10);
    }
}
