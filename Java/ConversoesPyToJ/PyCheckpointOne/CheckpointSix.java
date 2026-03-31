package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CheckpointSix {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado 1 e pressione ENTER: ");
        float lado1 = sc.nextFloat();

        System.out.println("Digite o lado 2 e pressione ENTER: ");
        float lado2 = sc.nextFloat();

        System.out.println("Digite o lado 3 e pressione ENTER: ");
        float lado3 = sc.nextFloat();

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) {
            System.out.println("Os valores formam um triângulo.");

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Seu triângulo é equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Seu triângulo é isósceles");
            } else {
                System.out.println("Seu triângulo é escaleno");
            }
        }
    }
}
