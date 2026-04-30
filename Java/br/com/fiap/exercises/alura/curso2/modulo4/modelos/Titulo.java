package br.com.fiap.exercises.alura.curso2.modulo4.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() { return this.nome; }
    void setNome(String n) { this.nome = n; }

    public int getAnoDeLancamento() { return this.anoDeLancamento; }
    void setAnoDeLancamento(int a) { this.anoDeLancamento = a; }

    public boolean isIncluidoNoPlano() { return this.incluidoNoPlano; }
    void setIncluidoNoPlano(boolean i) { this.incluidoNoPlano = i; }

    public int getTotalDeAvaliacoes() { return this.totalDeAvaliacoes; }

    public int getDuracaoEmMinutos() { return this.duracaoEmMinutos; }

    public void setSomaDasAvaliacoes(int s) { this.somaDasAvaliacoes = s; }
    public void setTotalDeAvaliacoes(int t) { this.totalDeAvaliacoes = t; }
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: "+getNome());
        System.out.println("Ano de lançamento: "+getAnoDeLancamento());
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
