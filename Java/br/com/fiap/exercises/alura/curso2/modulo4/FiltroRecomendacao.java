package br.com.fiap.exercises.alura.curso2.modulo4;

public class FiltroRecomendacao {

    public void filtra(Classificavel c) {
        if (c.getClassificacao() == 4) {
            System.out.println("Está entre os preferidos do momento.");
        } else if (c.getClassificacao() >= 2) {
            System.out.println("É muito bem avaliado no momento.");
        } else {
            System.out.println("Coloque na lista para assistir depois.");
        }
    }
}
