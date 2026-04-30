package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("Blusa XG",200,1);
        Produto p2 = new Produto("Blusa amo Cristo", 100,1);

        ArrayList<Produto> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        System.out.println(list);
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("Produto 1: " + list.get(0));
        System.out.println("Lista de produtos com preço maior do que R$100,00");

        for (Produto p : list) {
            if (p.getPreco() > 100) {
                System.out.println(p);
            }
        }

        System.out.println("==============================");
        ProdutoPerecivel perecivel = new ProdutoPerecivel("Hamburguer", 50, 1,"03/05/2026");
        System.out.println(perecivel);
    }
}
