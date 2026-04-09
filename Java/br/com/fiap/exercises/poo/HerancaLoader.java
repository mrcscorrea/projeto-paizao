package br.com.fiap.exercises.poo;

public class HerancaLoader {
    public static void main(String[] args) {
        Carro2 carro = new Carro2();
        carro.marca = "Hyundai";
        carro.modelo = "HB20";
        carro.ano = 2020;

        carro.exibirInfo();
        carro.ligar();
    }
}
