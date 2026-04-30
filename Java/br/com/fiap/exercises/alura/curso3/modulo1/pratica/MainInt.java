package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;

public class MainInt {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);

       for (int i : list) {
           System.out.println(i);
       }

       int soma = list.get(0) + list.get(1) + list.get(2) + list.get(3) + list.get(4);
        System.out.println("Soma dos números da lista: " + soma);
    }
}
