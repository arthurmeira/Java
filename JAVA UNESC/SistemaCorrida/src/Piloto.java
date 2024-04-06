public class Piloto {
    private int pontos;

    public Piloto(int pontos) {
        this.pontos = pontos;
    }

    private String getEquipe(){
        return "amadora";
    }

    private void contarPontos() {
        pontos += 1;
    }

    void ultrapassar() {
        contarPontos();
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void mostrarPontos(){
        System.out.println("A equipe " + getEquipe() + " possui " + pontos + " pontos");
    }

}
