package br.com.fiap.exercises.poo;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente() {}

    public Cliente(String nome, int idade, String cpf, char genero, int codigo) {
        super(nome, idade, cpf, genero);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    void mostrar() {
        //.
    }
//    boolean comprar(Produto produto) {
//        if (saldo >= produto.getPreco()) {
//            saldo -= produto.getPreco();
//
//            System.out.println(nome + " comprou " + produto.getNome() + " por " + produto.getPreco());
//            System.out.println("Saldo restante: R$"+saldo);
//
//            return true;
//        } else {
//            System.out.println("Saldo insuficiente");
//            return false;
//        }
//    }
}