package Entities;

public class Funcionario {

    //Variaveis privadas
    private String nome;
    private int codigo;
    private double salario;
    private double acrescimo;

    //Construtores
    public Funcionario(String nome, int codigo, double salario, double acrescimo){
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
        this.acrescimo = acrescimo;
    }

    public void novoSalario(){
        this.salario = salario + (salario * acrescimo) / 100;
    }

    public void Mostrar(){
        String dados = "\nDados funcionário: ";
        dados += "\nNome: " + getNome();
        dados += "\nCodigo: " + getCodigo();
        dados += "\nSalario em R$: " + getSalario();
        dados += "\nAcrescimo em %: " + getAcrescimo();
        novoSalario();
        dados += "\nNovo salario em R$: " + getSalario();
        System.out.println(dados);
    }

    //Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }
}
