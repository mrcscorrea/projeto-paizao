package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CheckpointSixteen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Mês em que nasceu e pressione ENTER: ");
        int monthRequest = sc.nextInt();

        System.out.println("Agora digite o dia em que nasceu e pressione ENTER: ");
        int dayRequest = sc.nextInt();
        String signo;

        if ((monthRequest == 3 && dayRequest >= 21) || (monthRequest == 4 && dayRequest <= 19)) {
           signo = "Áries";
           System.out.println(signo);
        } else if ((monthRequest == 4 && dayRequest >= 20) || (monthRequest == 5 && dayRequest <= 20)) {
            signo = "Touro";
            System.out.println(signo);
        } else if ((monthRequest == 5 && dayRequest >= 21) || (monthRequest == 6 && dayRequest <= 20)) {
            signo = "Gêmeos";
            System.out.println(signo);
        } else if ((monthRequest == 6 && dayRequest >= 21) || (monthRequest == 7 && dayRequest <= 22)) {
            signo = "Cancer";
            System.out.println(signo);
        } else if ((monthRequest == 7 && dayRequest >= 23) || (monthRequest == 8 && dayRequest <= 22)) {
            signo = "Leão";
            System.out.println(signo);
        } else if ((monthRequest == 8 && dayRequest >= 23) || (monthRequest == 9 && dayRequest <= 22)) {
            signo = "Virgem";
            System.out.println(signo);
        } else if ((monthRequest == 9 && dayRequest >= 23) || (monthRequest == 10 && dayRequest <= 22)) {
            signo = "Libra";
            System.out.println(signo);
        } else if ((monthRequest == 10 && dayRequest >= 23) || (monthRequest == 11 && dayRequest <= 21)) {
            signo = "Escorpião";
            System.out.println(signo);
        } else if ((monthRequest == 11 && dayRequest >= 22) || (monthRequest == 2 && dayRequest <= 21)) {
            signo = "Sagitário";
            System.out.println(signo);
        } else if ((monthRequest == 12 && dayRequest >= 22) || (monthRequest == 1 && dayRequest <= 19)) {
            signo = "Capricórnio";
            System.out.println(signo);
        } else if ((monthRequest == 1 && dayRequest >= 20) || (monthRequest == 2 && dayRequest <= 18)) {
            signo = "Aquário";
            System.out.println(signo);
        } else if ((monthRequest == 2 && dayRequest >= 19) || (monthRequest == 3 && dayRequest <= 20)) {
            signo = "Peixes";
            System.out.println(signo);
        } else {
            System.out.println("Data inválida");
        }

        sc.close();
    }
}
