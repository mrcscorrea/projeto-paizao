package br.com.fiap.exercises.alura.avulso;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public ContaBancaria() {}

    public ContaBancaria(int n, double s, String t) {
        setNumeroConta(n);
        setBankSaldo(s);
        setTitular(t);
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    void setNumeroConta(int n) {
        this.numeroConta = n;
    }

    public double getBankSaldo() {
        return this.saldo;
    }

    void setBankSaldo(double s) {
        this.saldo = s;
    }
    public String getTitular() {
        return this.titular;
    }

    void setTitular(String t) {
        this.titular = t;
    }
}
