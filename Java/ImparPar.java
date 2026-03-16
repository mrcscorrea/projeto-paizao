package br.com.fiap;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args){

        Scanner collector = new Scanner(System.in);

        System.out.println("Digite um número qualquer:");
        int number = collector.nextInt();

        int calculo = number % 2;

        if (calculo == 0) {
            System.out.println("Seu número " + number + " é par!");
        } else {
            System.out.println("Seu número " + number + " Não é par.");
        }
    }
}