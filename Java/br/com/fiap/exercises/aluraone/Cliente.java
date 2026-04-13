package br.com.fiap.exercises.aluraone;

public class Cliente {
    protected String name;
    protected String accountType;
    protected double initialValue;

    public Cliente() {}
    public Cliente(String name, String accountType, double initialValue) {
        this.name = name;
        this.accountType = accountType;
        this.initialValue = initialValue;
    }

    double getSaldo() {
        return initialValue;
    }

    void receberPix(double value) {
        initialValue += value;
        System.out.println("Você recebeu o pix de R$"+value+" na sua conta.");
        System.out.println("Saldo final: R$"+initialValue);
    }
    void transferirPix(double value) {
        if (initialValue<value) {
            System.out.println("Você não pode fazer um pix de um valor maior que o da sua conta.");
        } else {
            initialValue -= value;
            System.out.println("Você enviou um pix de R$" + value);
            System.out.println("Saldo final: R$" + initialValue);
        }
    }
}
