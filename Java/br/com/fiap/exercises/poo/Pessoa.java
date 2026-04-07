package br.com.fiap.exercises.poo;

public class Pessoa {
   private String nome;
   private int idade;
   private String cpf;
   private char genero;

    Pessoa(String nome, int idade, String cpf, char genero) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setGenero(genero);
    }

    String getNome() {
        return nome;
    }
    int getIdade() {
        return idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }
    void setGenero(char genero) {
        this.genero = genero;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Olá meu nome é " + nome + " tenho " + idade + " anos,");
    }
}
