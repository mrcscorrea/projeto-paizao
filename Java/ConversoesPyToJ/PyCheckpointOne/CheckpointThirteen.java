package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;
import java.lang.Math;

public class CheckpointThirteen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor A e pressione ENTER: ");
        float letterA = sc.nextFloat();

        System.out.println("Digite o valor B e pressione ENTER: ");
        float letterB = sc.nextFloat();

        System.out.println("Digite o valor C e pressione ENTER: ");
        float letterC = sc.nextFloat();

        double delta = (Math.pow(letterB,2)-(4*(letterA*letterC)));

        if (letterA == 0) {
            System.out.println("Sua equação não é do segundo grau por A ser igual a zero");
        } else {
            if (delta < 0) {
                System.out.println("Não há raizes reais por conta do delta ser negativo");
            } else {
                if (delta == 0) {
                    double result = -letterB / (2* letterA);
                    System.out.println("Seu delta foi zero");
                } else if (delta > 0) {
                    double result = (-letterB + Math.sqrt(delta)) / (2* letterA);
                    double result2 = (-letterB - Math.sqrt(delta)) / (2* letterA);
                    System.out.println("Sua raíz deu "+result2+" e "+result);
                }
            }
        }
    }
}
