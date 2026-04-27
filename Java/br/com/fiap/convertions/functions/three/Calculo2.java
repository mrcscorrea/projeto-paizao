package br.com.fiap.convertions.functions.three;

public class Calculo2 {
    public int lados;


    public Calculo2(int lados) {
        this.lados = lados;

    }

    public void calcularPoligono() {
        if (lados == 3) {
            System.out.println("TRIÂNGULO");
        } else if (lados == 4) {
            System.out.println("QUADRILÁTERO");
        } else if (lados == 5) {
            System.out.println("PENTÁGONO");
        } else {
            System.out.println("VALOR INVÁLIDO");
        }
    }
}
