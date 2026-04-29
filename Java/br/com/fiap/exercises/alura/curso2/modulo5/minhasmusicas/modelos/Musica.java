package br.com.fiap.exercises.alura.curso2.modulo5.minhasmusicas.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;


    public Musica() {}
    public Musica(String album, String artista, String genero) {
        setAlbum(album);
        setArtista(artista);
        setGenero(genero);
    }
    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
