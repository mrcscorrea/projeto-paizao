package br.com.fiap.exercises.poo;

public class ProdutoLoader {
    public static void main(String[] args) {

        Produto p1 = new Produto("Cafeteira", 2000);
        System.out.println("Produto com 15% de desconto: R$"+p1.calcularDesconto(15));
        System.out.println("Produto com R$200,00 de desconto: R$"+p1.calcularDesconto(200));
        System.out.println("Comprando 4 produtos: R$"+p1.calcularDesconto(4,true));
        System.out.println("-----------------------------");
        ProdutoEletronico celular = new ProdutoEletronico("Celular", 2000, true);
        System.out.println("Eletrônico com 15% de desconto: R$"+p1.calcularDesconto(15));
        System.out.println("Eletrônico com R$200,00 de desconto: R$"+p1.calcularDesconto(200));
        System.out.println("Eletrônico comprando 3 produtos: R$"+p1.calcularDesconto(3,true));

        System.out.println(p1);
        System.out.println(celular);
    }
}
