package Entities;

import java.util.ArrayList;

public class Livraria {
    private ArrayList<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public void adicionar(Livro livro){
        this.livros.add(livro);
    }

    public void listar(){
        for (Livro livro : livros) {
            livro.Mostrar();
        }
    }
}