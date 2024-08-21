package org.example.Entities;
import java.util.ArrayList;

public class Vetor {

    private ArrayList<Vetor> numero;
    private Integer num = -99999;

    public ArrayList<Vetor> getNumero() {
        return numero;
    }

    public void Adicionar(Vetor numero) {
        this.numero.add(numero);
    }

    public void Organizar(Vetor numero) {
        for (int i = 0; i < this.numero.size() - 1; i++) {
            for (int j = i + 1; j < this.numero.size(); j++) {
                
            }
        }
    }

    public void setNumero(ArrayList<Vetor> numero) {
        this.numero = numero;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Vetor () {
        this.numero = new ArrayList<>();
    }


}
