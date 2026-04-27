package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Pix implements Pagamento {
    private double saldo;

    public Pix(double s) {
        this.saldo = s;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void pagar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Você não pode realizar operações com valores maiores que seu saldo.");
        } else {

            setSaldo(getSaldo()-valor);
            System.out.println("Você realizou o pagamento.");
            System.out.println("Valor: R$" + valor);
            System.out.println("Saldo restante: R$" + getSaldo());
        }
    }
}
