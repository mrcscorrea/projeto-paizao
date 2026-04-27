package br.com.fiap.convertions.functions.two;

import java.util.Scanner;
public class FuncaoThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados do polígono e pressione ENTER: ");
        int lados = sc.nextInt();

        Calculo3 c1 = new Calculo3(lados);
        c1.calcularPoligono();
    }


}
