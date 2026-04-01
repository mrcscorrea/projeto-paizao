package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;
import java.lang.Math;

public class CheckpointOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome e pressione ENTER: ");
        String nameFound = sc.next();

        System.out.println("Digite o seu peso e pressione ENTER: ");
        float weightFound = sc.nextFloat();

        System.out.println("Agora digite a sua altura e pressione ENTER: ");
        float heightFound = sc.nextFloat();

        double imcCalc = weightFound / (Math.pow(heightFound, 2));

        if (imcCalc < 18.5) {
            String value = "pessoa abaixo do peso";
            System.out.println(nameFound + ", o seu IMC " + imcCalc + " é considerado " + value + ".");
        } else if (imcCalc > 18.5 && imcCalc < 24.9) {
            String value = "pessoa de peso normal";
            System.out.println(nameFound + ", o seu IMC " + imcCalc + " é considerado " + value + ".");
        } else if (imcCalc > 25.0 && imcCalc < 29.9) {
            String value = "pessoa sobrepeso";
            System.out.println(nameFound + ", o seu IMC " + imcCalc + " é considerado " + value + ".");
        } else if (imcCalc > 30.0 && imcCalc < 34.9) {
            String value = "pessoa Obesidade I";
            System.out.println(nameFound + ", o seu IMC " + imcCalc + " é considerado " + value + ".");
        } else if (imcCalc > 35.0 && imcCalc < 39.9) {
            String value = "pessoa Obesidade II";
            System.out.println(nameFound + ", o seu IMC " + imcCalc + " é considerado " + value + ".");
        } else {
            System.out.println(nameFound + ", o seu IMC " + imcCalc + " é considerado pessoa Obesidade III (mórbida).");
        }
    }
}
