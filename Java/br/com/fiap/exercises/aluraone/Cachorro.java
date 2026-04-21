package br.com.fiap.exercises.aluraone;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo!");
    }
}
