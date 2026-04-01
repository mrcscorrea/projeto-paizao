package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;

public class CheckpointSeven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade e pressione ENTER: ");
        int yearsOld = sc.nextInt();

        System.out.println("Digite quantos anos você trabalhou e pressione ENTER: ");
        int contribution = sc.nextInt();

        boolean retiree = ((yearsOld >= 65 || contribution >= 30) || (yearsOld >= 60 && contribution >= 25));
        if (retiree) {
            System.out.println("Você tem " + yearsOld + " de idade e trabalhou " + contribution + " anos, logo pode se aposentar.");
        } else {
            System.out.println("Você tem " + yearsOld + " de idade e trabalhou " + contribution + " anos, ainda não pode se aposentar.");
        }
    }
}
