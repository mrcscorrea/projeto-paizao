package br.com.fiap.exercises.poo;
import java.util.Scanner;
public class Loader {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto("Notebook",1000);
        Cliente c = new Cliente("Marcos", 1500);

        c.comprar(p);
//        System.out.println("Vamos criar seu novo produto!");
//        System.out.println("Digite o nome do seu novo produto e pressione ENTER: ");
//        String name = sc.nextLine();
//
//        System.out.println("Digite um preço desejado e pressione ENTER: ");
//        float price = sc.nextFloat();
//
//        Produto product = new Produto(name, price);
//        product.exibirProduto();
//
//        product.aplicarDesconto(10);
//        System.out.println("Aplicado desconto, mostrando informações...");
//        product.exibirProduto();
//        product.aumentarPreco(10);
//        System.out.println("Aumentado o preço do produto, mostrando informações...");
//        product.exibirProduto();

    }
}
