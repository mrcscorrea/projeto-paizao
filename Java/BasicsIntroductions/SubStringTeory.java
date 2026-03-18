package br.com.fiap;

public class SubStringTeory {
    static void main(String[] args) {
        String nome = ("FIAP A MELHOR");
        String result = nome.substring(0,5);
        String result2 = nome.substring(6);
        IO.println(result);
        IO.println(result2);
    }
}
