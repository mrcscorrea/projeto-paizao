package br.com.fiap.exercises.alura.curso2.modulo4.modelos;

import br.com.fiap.exercises.alura.curso2.modulo4.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() { return this.diretor; }
    public void setDiretor(String d) { this.diretor = d; }

    public Filme(String n, int anoDeLancamento) {
        super(n, anoDeLancamento);
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + getAnoDeLancamento() + ")";
    }
}
