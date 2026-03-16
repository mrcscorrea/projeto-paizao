package br.com.fiap;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Digite a nota da sua prova (AV1):");
        float av1 = inputCollector.nextFloat();

        System.out.println("Digite a nota do seu trabalho avaliativo (TB):");
        float tb = inputCollector.nextFloat();

        System.out.println("Digite a nota do seu simulado (AV2):");
        float av2 = inputCollector.nextFloat();

        float finalMedia = (av1 + tb + av2)/2;

        if (finalMedia >= 6) {
            System.out.println("Você passou de ano!");

        } else if (finalMedia >= 3 && finalMedia < 6) {
            System.out.println("Está de recuperação!");
        } else {
            System.out.println("Repetiu de ano.");
        }
    }
}