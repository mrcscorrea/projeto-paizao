package br.com.fiap.convertions.switchcase;
import java.util.Scanner;

public class MathCaseExerciseFour {
     static void main(String[] args) {

        Scanner scaneador = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scaneador.nextInt();

        switch (number % 3) {
            case 0:
                System.out.println("Seu número é múltiplo de três");
                break;

            default:
                System.out.println("Seu número não é múltiplo de três");
        }
    }
}