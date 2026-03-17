package br.com.fiap.ConversoesPyToJ.SwitchCaseQuestions;
import java.util.Scanner;

public class MathCaseExerciseThree {
    static void main(String[] args) {

        Scanner scaneador = new Scanner(System.in);

        IO.print("Digite um número: ");
        int number = scaneador.nextInt();

        IO.println("\nMenu de Cálculos\n\n1: Dobrar o número\n2: Dividir o número pela metade\n3: Mostrar apenas 10% do número");
        IO.print("Digite uma opção: ");
        int option = scaneador.nextInt();

        switch (option) {
            case 1:
                double operation = number * 2;
                IO.print("Seu número " + number + " após a operação foi " + operation);
                break;

            case 2:
                operation = number / 2;
                IO.print("Seu número " + number + " após a operação foi " + operation);
                break;

            case 3:
                operation = number * 0.1;
                IO.print("Seu número " + number + " após a operação foi " + operation);
                break;

            default:
                IO.println("Entrada inválida!");
                break;

        }

    }

}
