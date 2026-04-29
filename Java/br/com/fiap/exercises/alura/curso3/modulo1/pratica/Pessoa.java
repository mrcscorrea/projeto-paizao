package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

public class Pessoa {
    private String nome;

    public Pessoa() {}
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
