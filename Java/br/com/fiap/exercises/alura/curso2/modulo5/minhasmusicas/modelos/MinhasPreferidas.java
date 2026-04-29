package br.com.fiap.exercises.alura.curso2.modulo5.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " está nas preferidas");
        } else {
            System.out.println(audio.getTitulo() + " é uma boa, deveria ouvir.");
        }
    }
}
