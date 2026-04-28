package br.com.fiap.exercises.alura.curso2.modulo4.calculos;

import br.com.fiap.exercises.alura.curso2.modulo4.modelos.Filme;
import br.com.fiap.exercises.alura.curso2.modulo4.modelos.Episodio;
import br.com.fiap.exercises.alura.curso2.modulo4.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}