package br.com.fiap.exercises.alura.avulso;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public Carro() {}
    public Carro(String modelo, double precoAno1, double precoAno3) {
    }

    String getModelo() { return modelo; }
    void setModelo(String m) { this.modelo = m; }

    double getPrecoAno1() { return precoAno1; }
    void setPrecoAno1(double p1) { this.precoAno1 = p1; }

    double getPrecoAno2() { return precoAno2; }
    void setPrecoAno2(double p2) { this.precoAno2 = p2; }

    double getPrecoAno3() { return precoAno3; }
    void setPrecoAno3(double p3) { this.precoAno3 = p3; }

    protected void puxarInformacoes() {
        System.out.println("--- Carro ---");
        System.out.println("Modelo do carro: " + getModelo());
        System.out.println("Preço Ano 1: R$" + getPrecoAno1());
        System.out.println("Preço Ano 2: R$" + getPrecoAno2());
        System.out.println("Preço Ano 3: R$" + getPrecoAno3());
        calcularMaiorEMenorPreco();
    }

    private void calcularMaiorEMenorPreco() {
        double[] precos = {precoAno1, precoAno2, precoAno3};
        double maiorPreco = precos[0];
        double menorPreco = precos[0];

        for (double preco : precos) {
            if (preco > maiorPreco) maiorPreco = preco;
            if (preco < menorPreco) menorPreco = preco;
        }
        System.out.println("Maior Preço: R$ " + maiorPreco);
        System.out.println("Menor Preço: R$ " + menorPreco);
    }
}
