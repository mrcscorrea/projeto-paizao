package br.com.fiap.exercises.alura.curso3.modulo1;

public class Pessoa {
    private String nome;
    private int idade;

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

    @Override
    public String toString() {
        String apresentar = "\nNome da pessoa: " + this.nome + "\nIdade: " + this.idade;
        return apresentar;
    }
}
