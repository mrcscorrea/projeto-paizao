package br.com.fiap;

public class SubStringTeory2 {
    static void main(String[] args) {

        String nomeCompleto = "Marcos Vinícios";
        int spacePosition = nomeCompleto.indexOf(" ");
        String nome = nomeCompleto.substring(0, spacePosition);
        IO.println(nome);
        String sobrenome = nomeCompleto.substring(spacePosition + 1);
        IO.println(sobrenome);
    }
}
