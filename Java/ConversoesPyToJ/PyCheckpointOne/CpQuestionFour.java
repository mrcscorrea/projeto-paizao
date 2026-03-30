package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CpQuestionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em segundos e pressione ENTER: ");
        float numberSeconds = sc.nextInt();

        float numberHours = numberSeconds / 3600;
        float remainder = numberSeconds % 3600;

        float minutes = remainder / 60;
        float secondsRemaining = remainder % 60;

        System.out.println(numberHours + " horas, " + minutes + " minutos e " + secondsRemaining + " segundos.");
    }
}
