package br.com.fiap.exercises.alura.curso3.modulo1.pratica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome de uma pessoa:");
            String nome = sc.nextLine();

            Pessoa p = new Pessoa();
            p.setNome(nome);
            list.add(p);
        }


        for (Pessoa p1 : list) {
            System.out.println(p1);
        }
    }
}
