package br.com.fiap.convertions.functions.three;

import java.util.Scanner;
public class FuncaoTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados do polígono e pressione ENTER: ");
        int lados = sc.nextInt();

        Calculo2 c1 = new Calculo2(lados);
        c1.calcularPoligono();
    }


}
