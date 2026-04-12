package br.com.fiap.exercises.teory;
import java.util.Random;
import java.util.Scanner;
public class Advinhacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aleatoryNumber = new Random().nextInt(100);
        System.out.println("Digite um número e veja se acertou: ");
        int selectedNumber = sc.nextInt();
        int trys = 1;

        while (trys <5) {

            System.out.printf("Você possui %d/5 tentativas", trys);
            System.out.println(" ");
            selectedNumber = sc.nextInt();
            trys++;

            if (selectedNumber == aleatoryNumber) {
                System.out.printf("Você advinhou correto! Selecionou %d.", selectedNumber);
                break;

            } else if (selectedNumber < aleatoryNumber){
                System.out.println("O número digitado é menor que o número a ser advinhado");
            } else {
                System.out.println("O número digitado é maior que o número a ser advinhado");
            }
        }
        if (trys == 5 && selectedNumber != aleatoryNumber) {
            System.out.println("Você esgotou a quantidade de tentativas e não acertou.");
            System.out.println("O número correto era "+aleatoryNumber);
        }
    }
}
