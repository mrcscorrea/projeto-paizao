package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

public class ProdutoPerecivel extends Produto {
    private String dataDeValidade;

    public ProdutoPerecivel(String n, float p, int q, String d) {
        super(n, p, q);
        this.dataDeValidade = d;
    }
    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "\nNome do produto: " + this.getNome() + "\nPreço do produto: " + this.getPreco() + "\nQuantidade: " + this.getQtd() + "\nData de validade: " + this.dataDeValidade;
    }
}
