package br.com.fiap;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto() {}
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(int porcentagem) {
        return preco - preco * porcentagem/100;
    }
    public double calcularDesconto(double valor) {
        return preco - valor;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nPreço: R$" + preco;
    }
    public double calcularDesconto(int qtd, boolean promocao) {
        double valorFinal = preco * qtd;
        if (promocao) {
            if (qtd == 1) {
                valorFinal *= 0.9;
            } else if (qtd < 5) {
                valorFinal *= 0.8;
            } else {
                valorFinal *= 0.7;
            }
        }
        return valorFinal;
    }
}
