package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Quadrado implements Forma {
    private int lado;

    public Quadrado() {}
    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = Math.pow(lado,2);
        return area;
    }
}
