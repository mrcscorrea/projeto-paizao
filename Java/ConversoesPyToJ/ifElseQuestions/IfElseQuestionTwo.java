package br.com.fiap.ConversoesPyToJ.ifElseQuestions;
import java.util.Scanner;

public class IfElseQuestionTwo {
    public static void main(String[] args) {

        Scanner scannerOne = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int yearRequest = scannerOne.nextInt();

        int actualYear = 2026;

        int idade = actualYear - yearRequest;

        System.out.println("Sua idade é " + idade);

        if (idade < 18) {

            System.out.println("Você é de menor ainda.");

        } else if (idade > 18 && idade <= 64) {

            System.out.println("Você é um adulto.");

        } else if (idade >= 65) {

            System.out.println("Você é um idoso");

        }

    }

}
