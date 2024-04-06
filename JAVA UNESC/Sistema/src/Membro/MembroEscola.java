package Membro;

public class MembroEscola {
    private String nome;
    private int idade;
    private int id;

    public MembroEscola(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public void mostrarDetalhes() {
        String mostrar = "\nDetalhes membro: ";
        mostrar += "\nNome: " + getNome();
        mostrar += "\nIdade: " + getIdade();
        mostrar += "\nID: " + getId();
        System.out.println(mostrar);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
