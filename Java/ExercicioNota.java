package br.com.fiap;

public class ExercicioNota {
    public static void main(String[] args){

        int notaSemestral = 7;
        int notaTrabConclusao = 5;
        int notaInt1 = 10;
        int notaInt2 = 6;

        float mediaAi = (notaInt1 + notaInt2)/2;
        double mediaTotal = notaSemestral * 0.5 + notaTrabConclusao * 0.3 + mediaAi * 0.2;

        System.out.println(mediaTotal);

    }

}
