package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;

public class Main2Int {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);

        for (int i : list) {
            float resto = i%2;
            if (resto == 0) {
                System.out.println(i);
            }
        }
    }
}
