package br.com.fiap.ConversoesPyToJ.SwitchCaseQuestions;
import java.util.Scanner;

public class MathCaseExerciseFour {
     static void main(String[] args) {

        Scanner scaneador = new Scanner(System.in);

        IO.print("Digite um número: ");
        int number = scaneador.nextInt();

        switch (number % 3) {
            case 0:
                IO.print("Seu número é múltiplo de três");
                break;

            default:
                IO.print("Seu número não é múltiplo de três");
        }
    }
}