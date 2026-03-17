package br.com.fiap.BasicsIntroductions;

import java.util.Scanner;

public class ScannerIntroduction {
    public static void main(String[] args){

        Scanner caixaMercado = new Scanner(System.in);

        System.out.println("Digite a quantidade de laranjas que deseja comprar:");
        int laranjaQtd = caixaMercado.nextInt();

        System.out.println("Sua compra será paga via pix? Digite True ou False:");
        boolean isPix = caixaMercado.nextBoolean();

        double totalValue = laranjaQtd < 10 ? laranjaQtd * 2.0 : laranjaQtd * 2.5;

        totalValue = isPix? totalValue * 0.9 : totalValue;

        System.out.println("Você pagou " + totalValue + " por " + laranjaQtd + " laranjas.");
    }
}
