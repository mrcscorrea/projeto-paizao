package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;

public class MainCalc {
    public static void main(String[] args) {

        Produto p1 = new Produto("Celular", 1000,1);
        Produto p2 = new Produto("Notebook", 2000,1);
        Produto p3 = new Produto("Televisão", 3400,1);
        Produto p4 = new Produto("Creatina", 50,2);

        ArrayList<Produto> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

            float preco1 = list.get(0).getPreco();
            float preco2 = list.get(1).getPreco();
            float preco3 = list.get(2).getPreco();
            float preco4 = list.get(3).getPreco();

            float somaTotal = preco1 + preco2 + preco3 + preco4;
            System.out.println("Soma total do seu carrinho: R$" + somaTotal);
    }
}
