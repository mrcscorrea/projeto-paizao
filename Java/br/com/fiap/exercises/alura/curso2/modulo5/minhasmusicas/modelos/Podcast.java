package br.com.fiap.exercises.alura.curso2.modulo5.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;
    private String apresentador;


    public Podcast() {}
    public Podcast(String host, String descricao) {
        setHost(host);
        setDescricao(descricao);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void mostrar() {
        System.out.println("NOVO PODCAST");
        System.out.println("Nome do podcast: " + getTitulo());
        System.out.println("Apresentador do podcast: " + getApresentador());
        System.out.println("Host do podcast: " + getHost());
        System.out.println("Descrição do vídeo: " + getDescricao());
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
}
