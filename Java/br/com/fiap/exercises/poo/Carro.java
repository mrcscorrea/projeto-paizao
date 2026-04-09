package br.com.fiap.exercises.poo;

public class Carro {
    protected String marca;
    protected String modelo;
    protected int ano;

    String getMarca() {
        return marca;
    }

    String getModelo() {
        return modelo;
    }

    int getAno() {
        return ano;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

    void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Você não retornou marca corretamente");
        }
    }

    void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Você não retornou o modelo corretamente");
        }
    }

    Carro(String marca, String modelo, int ano) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }


    boolean ehBomba() {

        return "Peugeot".equalsIgnoreCase(marca) && "206".equalsIgnoreCase(modelo);
    }
}