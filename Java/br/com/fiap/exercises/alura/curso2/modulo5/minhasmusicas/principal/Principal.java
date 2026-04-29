package br.com.fiap.exercises.alura.curso2.modulo5.minhasmusicas.principal;

import br.com.fiap.exercises.alura.curso2.modulo5.minhasmusicas.modelos.MinhasPreferidas;
import br.com.fiap.exercises.alura.curso2.modulo5.minhasmusicas.modelos.Musica;
import br.com.fiap.exercises.alura.curso2.modulo5.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Entrador");
        minhaMusica.setGenero("Piseiro");
        minhaMusica.setArtista("Lonely Z");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Hylex Cast");
        meuPodcast.setApresentador("Camarão");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 800; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

        meuPodcast.mostrar();
    }
}
