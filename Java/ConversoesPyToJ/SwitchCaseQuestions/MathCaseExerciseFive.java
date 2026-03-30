package br.com.fiap.ConversoesPyToJ.SwitchCaseQuestions;
import java.util.Scanner;

public class MathCaseExerciseFive {
    static void main(String[] args) {
        Scanner scaneador = new Scanner(System.in);

        System.out.println("Palestras de Hoje\n\n1: Linux\n2: Banco de Dados\n3: Windows Server\n4: Lógica de Programação");

        System.out.println("Digite a opção desejada a saber o local: ");
        int option = scaneador.nextInt();

        switch (option) {

            case 1:
                System.out.print("Linux - Local: Auditório 1");
                break;

            case 2:
                System.out.print("Banco de Dados - Local: Auditório 2");
                break;

            case 3:
                System.out.print("Windows Server - Local: Auditório 3");
                break;
            case 4:
                System.out.print("Lógica e Programação - Local: Auditório Principal");
                break;

            default:
                System.out.print("Entrada inválida.");

        }

    }

}
