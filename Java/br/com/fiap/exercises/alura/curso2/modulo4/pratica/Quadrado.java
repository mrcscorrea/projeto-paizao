package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Quadrado implements Forma {
    private int lado;

    public Quadrado() {}
    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = Math.pow(lado,2);
        System.out.println("Área do quadrado: " + area);
    }
}
