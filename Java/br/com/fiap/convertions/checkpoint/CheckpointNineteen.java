package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;

public class CheckpointNineteen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 12 e pressione ENTER: ");
        int monthRequest = sc.nextInt();

        switch (monthRequest) {
            case 1:
                System.out.println("Janeiro");
                System.out.println("É um mês de 31 dias");
                break;
            case 2:
                System.out.println("Fevereiro");
                System.out.println("É um mês que tem 28 ou 29 dias (a depender do leapYear)");
                break;
            case 3:
                System.out.println("Março");
                System.out.println("É um mês de 31 dias");
                break;
            case 4:
                System.out.println("Abril");
                System.out.println("É um mês de 30 dias");
                break;
            case 5:
                System.out.println("Maio");
                System.out.println("É um mês de 31 dias");
                break;
            case 6:
                System.out.println("Junho");
                System.out.println("É um mês de 30 dias");
                break;
            case 7:
                System.out.println("Julho");
                System.out.println("É um mês de 31 dias");
                break;
            case 8:
                System.out.println("Agosto");
                System.out.println("É um mês de 31 dias");
                break;
            case 9:
                System.out.println("Setembro");
                System.out.println("É um mês de 30 dias");
                break;
            case 10:
                System.out.println("Outubro");
                System.out.println("É um mês de 31 dias");
                break;
            case 11:
                System.out.println("Novembro");
                System.out.println("É um mês de 30 dias");
                break;
            case 12:
                System.out.println("Dezembro");
                System.out.println("É um mês de 31 dias");
                break;
        }
    }
}
