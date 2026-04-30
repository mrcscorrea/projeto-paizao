package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

public class Produto {
    private String nome;
    private float preco;
    private int qtd;

    public Produto() {}
    public Produto(String n, float p, int q) {
        this.nome = n;
        this.preco = p;
        this.qtd = q;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nNome do produto: " + this.nome + "\nPreço do produto: " + this.preco + "\nQuantidade: " + this.qtd;
    }
}
