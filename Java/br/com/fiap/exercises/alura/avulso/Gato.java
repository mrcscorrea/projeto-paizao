package br.com.fiap.exercises.alura.avulso;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O gato está ronronando!");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando os móveis da casa!");
    }

}
