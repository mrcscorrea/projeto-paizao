package br.com.fiap.exercises.teory;

public class SubStringTeory2 {
    static void main(String[] args) {

        String nomeCompleto = "Marcos Vinícios";
        int spacePosition = nomeCompleto.indexOf(" ");
        String nome = nomeCompleto.substring(0, spacePosition);
        System.out.println(nome);
        String sobrenome = nomeCompleto.substring(spacePosition + 1);
        System.out.println(sobrenome);
    }
}
