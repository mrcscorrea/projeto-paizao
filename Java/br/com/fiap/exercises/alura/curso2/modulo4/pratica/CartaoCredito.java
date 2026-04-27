package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class CartaoCredito implements Pagamento {
    private double saldo;
    private static final double tax = 0.1;

    public CartaoCredito(double saldo) {
        setSaldo(saldo);
    }
    @Override
    public void pagar(double valor) {
         if (valor > getSaldo()) {
             System.out.println("Você não pode realizar operações com valores maiores que seu saldo.");
         } else {

             double imposto = valor * tax;
             double finalValue = valor + imposto;

             setSaldo(getSaldo()-finalValue);
             System.out.println("Você realizou o pagamento.");
             System.out.println("Valor sem taxa: R$" + valor);
             System.out.println("Valor com taxa: R$" + finalValue);
             System.out.println("Saldo restante: R$" + getSaldo());
         }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
