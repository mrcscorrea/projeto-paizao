package br.com.fiap.Conversoes;
import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args){

        Scanner collector = new Scanner(System.in);

        System.out.println("Digite um número qualquer:");
        int number = collector.nextInt();

        int calculo = number % 2;

        if (number > 0 && calculo == 0) {
            System.out.println("Seu número " + number + " é positivo e par!");
        } else if (number > 0 && calculo > 0) {
            System.out.println("Seu número " + number + " é positivo e ímpar.");
        } else if (number < 0 && calculo == 0) {
            System.out.println("Seu número " + number + " é negativo e par.");
        } else {
            System.out.println("Seu número " + number + " é negativo e ímpar.");
        }
    }
}