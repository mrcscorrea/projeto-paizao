package br.com.fiap.ConversoesPyToJ.SwitchCaseQuestions;
import java.util.Scanner;

public class MathCaseExerciseOne {
    static void main(String[] args) {

        Scanner scaneador = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double totalValue = scaneador.nextDouble();

        System.out.print("Compradores\n\n1: Cliente Comum\n2: Funcionário\n3: Cliente VIP\n\nDigite o tipo de comprador: ");
        int clientType = scaneador.nextInt();

        switch (clientType) {

            case 1:
                System.out.println("Você comprou com 0% de desconto, logo o valor foi " + totalValue);
                break;

            case 2:
                totalValue *= 0.9;
                System.out.println("Você comprou com 10 de desconto, logo o valor foi " + totalValue);
                break;

            case 3:
                totalValue *= 0.95;
                System.out.println("Você comprou com 5% de desconto, logo o valor foi " + totalValue);
                break;

            default:
                System.out.println("Entrada inválida!");

        }

    }

}