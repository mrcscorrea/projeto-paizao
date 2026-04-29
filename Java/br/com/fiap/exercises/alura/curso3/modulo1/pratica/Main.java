package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Marcos");

        Pessoa p2 = new Pessoa();
        p2.setNome("João");

        Pessoa p3 = new Pessoa();
        p3.setNome("Luís");

        ArrayList<Pessoa> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Pessoa p : lista) {
            System.out.println(p);
        }
    }
}
