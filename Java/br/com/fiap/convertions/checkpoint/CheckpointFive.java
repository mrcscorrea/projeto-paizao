package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;

public class CheckpointFive {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano que você deseja e pressione ENTER: ");

        int yearRequest = sc.nextInt();

        float calculoOne = yearRequest % 100;
        float calculoTwo = yearRequest % 4;
        float calculoThree = yearRequest % 400;

        boolean leapYear = (calculoTwo == 0 && calculoOne != 0) || (calculoThree == 0);
        if (leapYear) {
            System.out.println("O seu ano " + yearRequest + " é bissexto");
        } else {
            System.out.println("O seu ano " + yearRequest + " não é bissexto");
        }
    }
}
