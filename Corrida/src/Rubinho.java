public class Rubinho extends Piloto{

    public Rubinho (int pontos) {
        super(pontos);
    }

    public String getEquipe(){
        return "Ferrari";
    }

    public void ultrapassar() {
        super.ultrapassar();
        System.out.println("O piloto da " + getEquipe() + " subiu uma posicao");
    }
}
