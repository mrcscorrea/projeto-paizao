package br.com.fiap.exercises.poo;

public class Cliente {
    private String nome;
    private float saldo;

    Cliente(String nome, float saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    boolean comprar(Produto produto) {
        if (saldo >= produto.getPreco()) {
            saldo -= produto.getPreco();

            System.out.println(nome + " comprou " + produto.getNome() + " por " + produto.getPreco());
            System.out.println("Saldo restante: R$"+saldo);

            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
}