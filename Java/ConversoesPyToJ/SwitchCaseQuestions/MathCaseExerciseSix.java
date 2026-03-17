package br.com.fiap.ConversoesPyToJ.SwitchCaseQuestions;
import java.util.Scanner;

public class MathCaseExerciseSix {
    static void main(String[] args) {

        Scanner scaneador = new Scanner(System.in);

        IO.println("Menu de Opções\n\n1: Picanha - 25,00\n2: Lasanha - 20,00\n3: Strogonoff - 20,00\n4: Bife Acebolado - 15,00\n5: Pão com Ovo - 5,00");

        double value = 0;
        String prato = "";

        IO.println("Digite a opção do prato desejado e pressione ENTER para continuar: ");
        int option = scaneador.nextInt();

        switch (option) {

            case 1:
                value = 25.00;
                prato = "Picanha";
                break;

            case 2:
                value = 20.00;
                prato = "Lasanha";
                break;

            case 3:
                value = 20.00;
                prato = "Strogonoff";
                break;

            case 4:
                value = 15.00;
                prato = "Bife Acebolado";
                break;

            case 5:
                value = 5.00;
                prato = "Pão com Ovo";
                break;

        }

        IO.println("Deseja pagar 10% de gorjeta ao garçom? (S/N): ");
        String optionGorjeta = scaneador.next();

        if (optionGorjeta.equalsIgnoreCase("S")) {

            value *= 1.10;
            System.out.printf("Você comprou %s e pagou %.2f%n",prato,value);

        } else if (optionGorjeta.equalsIgnoreCase("N")) {

            value = value;
            IO.println("Você comprou um " + prato + " e pagou um total de "+ value);

            scaneador.close();

        }

    }

}