package br.com.fiap;

public class UpperLowerCaseTeory {
    static void main(String[] args) {

        String nome = "Fiap";
        String nomeMaiusculo = nome.toUpperCase();
        String nomeMinusculo = nome.toLowerCase();

        IO.println(nome);
        IO.println(nomeMaiusculo);
        IO.print(nomeMinusculo);
    }
}
