package Entities;

import java.util.ArrayList;

public class Livraria  {
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

     public void pesquisar(int isbn) {
         for (Livro livro : livros) {
             if (livro.getIsbn() == isbn) {
                 return livro;
             }
         }
     }
}