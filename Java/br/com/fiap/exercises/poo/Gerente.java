package br.com.fiap.exercises.poo;

public class Gerente extends Funcionario {
    protected double bonus;

    public Gerente() {}
    public Gerente(String nome, double salario, double bonus) {
        super(nome,salario);
        this.bonus = bonus;
    }

    double calcularSalario() {
        double valor = salario + bonus;
        return valor;
    }
}
