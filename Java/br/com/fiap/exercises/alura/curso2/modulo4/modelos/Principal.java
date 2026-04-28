package br.com.fiap.exercises.alura.curso2.modulo4.modelos;

import br.com.fiap.exercises.alura.curso2.modulo4.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Transformers");
        meuFilme.setAnoDeLancamento(2007);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setSomaDasAvaliacoes(10);
        meuFilme.setTotalDeAvaliacoes(1);
        meuFilme.exibeFichaTecnica();
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Transfomers G1");
        serie.setAnoDeLancamento(1980);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar: "+serie.getDuracaoEmMinutos());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var gow = new Filme();
        gow.setNome("God of War");
        gow.setAnoDeLancamento(2000);
        gow.setDiretor("Santa Monica Studios");
        gow.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(gow);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());
    }
}
