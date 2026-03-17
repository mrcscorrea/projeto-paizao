package br.com.fiap.ConversoesPyToJ.ifElseQuestions;

import java.util.Scanner;

public class IfElseQuestionOne {
    public static void main(String[] args) {

        Scanner scannerOne = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        float weightRequest = scannerOne.nextFloat();

        System.out.print("Agora digite a sua altura: ");
        float heightRequest = scannerOne.nextFloat();

        double potencia = Math.pow(heightRequest, 2);
        double imcCalc = weightRequest / potencia;

        if (imcCalc < 18.5) {

            System.out.print("Seu IMC " + imcCalc + " é considerado pessoa abaixo do peso.");

        } else if (imcCalc > 18.5 && imcCalc < 24.9) {

            System.out.print("Seu IMC " + imcCalc + " é considerado pessoa de peso normal.");

        } else if (imcCalc > 25.0 && imcCalc < 29.9) {

            System.out.print("Seu  " + imcCalc + " é considerado pessoa sobrepeso.");

        } else if (imcCalc > 30.0 && imcCalc < 34.9) {

            System.out.print("Seu IMC " + imcCalc + " é considerado pessoa Obesidade I");

        } else if (imcCalc > 35.0 && imcCalc < 39.9) {

            System.out.print("Seu IMC " + imcCalc + " é considerado pessoa Obesidade II (severa).");

        } else {

            System.out.print("Seu IMC " + imcCalc + "é considerado pessoa Obesidade III (mórbida).");

        }

    }

}
