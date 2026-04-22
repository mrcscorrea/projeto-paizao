package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class FormaLoader {
    public static void main(String[] args) {

        Quadrado q1 = new Quadrado(2);
        System.out.println("Área do Quadrado: " + q1.calcularArea());

        Circulo c1 = new Circulo(4);
        System.out.println("Área do Círculo: "+ c1.calcularArea());
    }
}
