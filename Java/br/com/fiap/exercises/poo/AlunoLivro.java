package br.com.fiap.exercises.poo;
import java.lang.String;

public class AlunoLivro {
    private String nome;
    private Livro livro;

    AlunoLivro(String nome, Livro livro) {
        this.nome = nome;
        this.livro = livro;
    }

    void estudar() {
        System.out.println(nome + " está estudando o livro "+livro.getTitulo());
        System.out.println("- O livro "+livro.getTitulo()+" é do autor "+livro.getAutor()+" e custa "+livro.getPreco());
    }
}
