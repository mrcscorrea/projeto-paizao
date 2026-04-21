package br.com.fiap.exercises.alura.curso2.modulo4;

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
    }
}
