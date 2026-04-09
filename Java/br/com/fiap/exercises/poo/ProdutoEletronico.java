package br.com.fiap;

public class ProdutoEletronico extends Produto {
    protected boolean garantia;

    public ProdutoEletronico() {}
    public ProdutoEletronico(String nome, double preco, boolean garania) {
        super(nome,preco);
        setGarantia(garantia);
    }

    @Override
    public double calcularDesconto(int qtd, boolean promocao) {
        double valorFinal = preco + qtd;
        if (qtd > 2 && promocao) {
            valorFinal *=0.95;
        }
        return valorFinal;

    }

    @Override
   public String toString() {
        return super.toString() + " Garantia: " + garantia;
    }

    public boolean isGarantia() {
        return garantia;
    }

    void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }
}
