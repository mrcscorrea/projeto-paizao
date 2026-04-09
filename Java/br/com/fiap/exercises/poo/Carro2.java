package br.com.fiap.exercises.poo;

public class Carro2 extends Veiculo {
    protected String modelo;

    public Carro2() {}

    public Carro2(String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirInfo() {
        System.out.println("=== Veículo ===");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }

    @Override
    void ligar() {
        System.out.println("Carro "+modelo+ " ligado com a chave");
    }
}
