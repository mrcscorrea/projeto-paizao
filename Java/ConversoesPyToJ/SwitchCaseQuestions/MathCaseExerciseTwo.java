package br.com.fiap.ConversoesPyToJ.SwitchCaseQuestions;
import java.util.Scanner;

public class MathCaseExerciseTwo {
    static void main(String[] args) {
        Scanner scaneador = new Scanner(System.in);

        System.out.println("Opções de Relacionamento\n\nS - Solteiro\nC - Casado\nV - Viúvo\nD - Divorciado");

        System.out.print("Digite a opção que se encontra com você (Apenas a primeira letra): ");
        String optionStat = scaneador.next();

        switch (optionStat.toUpperCase()) {

            case "S":
                System.out.println("Você é solteiro");
                break;

            case "C":
                System.out.println("Você é casado");
                break;

            case "V":
                System.out.println("Você é viúvo");
                break;

            case "D":
                System.out.println("Você é divorciado");
                break;

            default:
                System.out.println("Opção digitada inválida!");

        }

    }

}