package br.com.fiap;

public class Condicoes {

    public static void main(String[] args){

        int notaPt = 4;
        int notaMat = 5;
        int trabalho = 8;

        float notaMedia = (notaPt + notaMat + trabalho)/3;
        boolean media = notaMedia >= 6;

        System.out.println("Sua média foi " + notaMedia + " Em razão disso você teve seu aprovado como " + media);
    }

}
