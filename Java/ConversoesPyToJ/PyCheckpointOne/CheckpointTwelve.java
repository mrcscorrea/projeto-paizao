package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CheckpointTwelve {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota 1 e pressione ENTER: ");
        float noteOne = sc.nextFloat();

        System.out.println("Digite sua nota 2 e pressione ENTER: ");
        float noteTwo = sc.nextFloat();

        System.out.println("Digite a porcentagem de faltas e pressione ENTER: ");
        int fouls = sc.nextInt();
        String result;

        if (noteOne < 0 || noteTwo < 0) {
            System.out.println("Notas não podem ser negativas");
        } else if (fouls < 0 || fouls > 100) {
            System.out.println("A porcentagem de faltas deve estar entre 0% e 100%");
        } else {
            if (fouls >= 25) {
                System.out.println("Você foi reprovado por ter mais de 25% em faltas.");
            } else {
                double noteCalc = (noteOne + noteTwo) / 2;
                if (noteCalc < 5) {
                    result = "reprovado";
                    System.out.println("Você está "+result+" por ter média "+noteCalc);
                } else if (noteCalc < 7) {
                    result = "de recuperação";
                    System.out.println("Você está "+result+" por ter média "+noteCalc);
                } else {
                    result = "aprovado";
                    System.out.println("Você está "+result+" por ter média "+noteCalc);
                }
            }
        }
    }
}
