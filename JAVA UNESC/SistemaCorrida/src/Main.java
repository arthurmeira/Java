
public class Main {
    public static void main(String[] args) {
            Rubinho rubinho = new Rubinho(0);
            Schumacher schumacher = new Schumacher(0);

            rubinho.ultrapassar();
            schumacher.ultrapassar();
            rubinho.ultrapassar();

            schumacher.mostrarPontos();
            rubinho.mostrarPontos();
    }
}