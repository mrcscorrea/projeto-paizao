package br.com.fiap.exercises.poo;

public class Produto {
    private String nome;
    private float preco;

    String getNome() {
        return nome;
    }

    float getPreco() {
        return preco;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setPreco(float preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido");
        }
    }

    public Produto() {}
    public Produto(String nome, float preco) {
        setNome(nome);
        setPreco(preco);
    }

    void exibirProduto() {
        System.out.println("Exibição de produto");
        System.out.println("Nome: "+nome);
        System.out.println("Preço: R$"+preco);
    }

    void aplicarDesconto(float percentual) {
        if (percentual >= 0 && percentual <= 100) {
            float desconto = preco * (percentual / 100);
            setPreco(preco - desconto);
        } else {
            System.out.println("Não foi possível aplicar desconto.");
        }
    }

    public double calcularDesconto(int qtd) {
        double valorFinal = getPreco() + qtd;
        if (qtd > 2) {
            valorFinal *=0.95;
        }
        return valorFinal;

    }

    public double calcularDesconto(int qtd, boolean promocao) {
        double valorFinal = getPreco() + qtd;
        if (qtd > 2 && promocao) {
            valorFinal *=0.95;
        }
        return valorFinal;

    }

    void aumentarPreco(float percentual) {
        float aumento = preco * (percentual/100);
        setPreco(preco + aumento);
    }
}
