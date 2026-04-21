package br.com.fiap.exercises.alura.curso2.modulo4;
import br.com.fiap.exercises.alura.curso2.modulo4.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() { return this.diretor; }
    public void setDiretor(String d) { this.diretor = d; }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
