package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;
public class CheckpointFourteen {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano desejado e pressione ENTER: ");
        int yearRequest = sc.nextInt();

        double calcOne = yearRequest % 4;
        double calcTwo = yearRequest % 100;
        double calcThree = yearRequest % 400;
        boolean leapYear = ((calcOne == 00 && calcTwo != 0) || (calcThree == 0));

        System.out.println("Digite o número do mês do ano desejado e pressione ENTER: ");
        int monthRequest = sc.nextInt();

        if (monthRequest > 12) {
            System.out.println("Você digitou uma entrada de mês inválida!");
        } else {
            System.out.println("Digite o dia do ano desejado e pressione ENTER: ");
            int dayRequest = sc.nextInt();
            int maxDay;
            if (monthRequest == 4 || monthRequest == 6 || monthRequest == 11) {
                maxDay = 31;
            } else if (monthRequest == 1 || monthRequest == 3 || monthRequest == 5 || monthRequest == 7 || monthRequest == 8 || monthRequest == 10 || monthRequest == 12) {
                maxDay = 30;
            } else if (monthRequest == 2 && !leapYear) {
                maxDay = 28;
            } else {
                maxDay = 29;
            }

            if (dayRequest > maxDay) {
                System.out.println("Você digitou um dia inválido para o mês desejado.");
            } else {
                System.out.println("Data validada! dia "+dayRequest+" do "+monthRequest+" de "+yearRequest);
            }
        }
    }
}
