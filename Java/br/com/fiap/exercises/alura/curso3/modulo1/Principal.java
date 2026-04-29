package br.com.fiap.exercises.alura.curso3.modulo1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa n1 = new Pessoa();
        n1.setNome("Marcos");
        n1.setIdade(18);

        Pessoa n2 = new Pessoa();
        n2.setNome("Guilherme");
        n2.setIdade(18);

        Pessoa n3 = new Pessoa();
        n3.setNome("João");
        n3.setIdade(18);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(n1);
        listaDePessoas.add(n2);
        listaDePessoas.add(n3);
        System.out.println("Quantidade de pessoas: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
