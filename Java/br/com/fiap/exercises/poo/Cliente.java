package br.com.fiap;

public class Cliente extends Pessoa {
    protected int codigo;
    protected double saldo;

    public Cliente() {}
    public Cliente(String nome, int idade, String cpf, String genero, int codigo, double saldo) {
        super(nome, idade, cpf, genero);
        setCodigo(codigo);
        setSaldo(saldo);
    }

    int getCodigo() {
        return codigo;
    }
    double getSaldo() {
        return saldo;
    }
    void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void apresentar() {
        System.out.println("==== APRESENTAÇÃO DE PESSOA ====");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("CPF: "+cpf);
        System.out.println("Gênero: "+genero);
        System.out.println("Código de Cliente: "+codigo);
        System.out.println("Saldo: R$"+saldo);
    }
}
