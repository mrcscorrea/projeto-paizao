package br.com.fiap.convertions.functions.one;

public class Calculo {
    public float notaOne;
    public float notaTwo;


    public Calculo(float n1, float n2) {
        this.notaOne = n1;
        this.notaTwo = n2;

    }

    public void calcularMedia() {
        float media = (notaOne+notaTwo)/2;
        if (media < 5) {
            System.out.println("Você foi reprovado");
        } else if (media == 5) {
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Você foi aprovado!");
        }
    }
}
