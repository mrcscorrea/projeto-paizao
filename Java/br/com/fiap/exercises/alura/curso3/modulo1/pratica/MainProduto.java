package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("Blusa XG",200);
        Produto p2 = new Produto("Blusa amo Cristo", 100);

        ArrayList<Produto> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        System.out.println(list);
        System.out.println("Lista de produtos com preço maior do que R$100,00");

        for (Produto p : list) {
            if (p.getPreco() > 100) {
                System.out.println(p);
            }
        }
    }
}
