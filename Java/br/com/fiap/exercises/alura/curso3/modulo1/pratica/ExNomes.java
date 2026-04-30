package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;

public class ExNomes {
    public static void main(String[] args) {

        String n1 = "Marcos";
        String n2 = "Heitor";
        String n3 = "Isaque";

        ArrayList<String> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);


        for (String s : list) {
            System.out.println(s);
        }

        list.remove("Marcos");
        System.out.println("Lista Atualizada");

        for (String s : list) {
            System.out.println(s);
        }



    }
}
