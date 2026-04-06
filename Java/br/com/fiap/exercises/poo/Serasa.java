package br.com.fiap.exercises.poo;

public class Serasa {
    private String nome;
    private int idade;
    private boolean estaDevendo;

    Serasa(String nome, int idade, boolean estaDevendo) {
        setNome(nome);
        setIdade(idade);
        setDivida(estaDevendo);
    }

    String getNome() {
        return nome;
    }

    int getIdade() {
        return idade;
    }

    boolean getDivida() {
        return estaDevendo;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void setDivida(boolean estaDevendo) {
        this.estaDevendo = estaDevendo;
    }

    void consultarNome() {
        System.out.println("=== SERASA CONSULTAS ===");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        if (!estaDevendo) {
            System.out.println("Seu cadastro se encontra limpo e em estado regular.");
        } else {
            System.out.println("Seu cadastro se enconta irregular e com dívidas presentes.");
        }
    }
}
