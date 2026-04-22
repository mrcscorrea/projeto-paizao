package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Circulo implements Forma {
    private int raio;

    Circulo() {}
    Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = 3.14 * Math.pow(raio,2);
        return area;
    }
}
