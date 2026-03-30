package br.com.fiap.ConversoesPyToJ.SwitchCaseQuestions;
import java.util.Scanner;

public class MathCaseExerciseThree {
    static void main(String[] args) {

        Scanner scaneador = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scaneador.nextInt();

        System.out.println("\nMenu de Cálculos\n\n1: Dobrar o número\n2: Dividir o número pela metade\n3: Mostrar apenas 10% do número");
        System.out.print("Digite uma opção: ");
        int option = scaneador.nextInt();

        switch (option) {
            case 1:
                double operation = number * 2;
                System.out.print("Seu número " + number + " após a operação foi " + operation);
                break;

            case 2:
                operation = number / 2;
                System.out.print("Seu número " + number + " após a operação foi " + operation);
                break;

            case 3:
                operation = number * 0.1;
                System.out.print("Seu número " + number + " após a operação foi " + operation);
                break;

            default:
                System.out.println("Entrada inválida!");
                break;

        }

    }

}
