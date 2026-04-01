package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;
import java.lang.Math;
public class CheckpointFifteen {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor a se sacar e pressione ENTER: ");
        int valueRequest = sc.nextInt();

        if (valueRequest == 1 || valueRequest == 3 || valueRequest <= 0) {
            System.out.println("O valor digitado foi incorreto.");
        } else {
            double note100 = Math.divideExact(valueRequest, 100);
            valueRequest %= 100;

            double note50 = Math.divideExact(valueRequest,50);
            valueRequest %= 50;

            double note20 = Math.divideExact(valueRequest,20);
            valueRequest %= 20;

            double note10 = Math.divideExact(valueRequest,10);
            valueRequest %= 10;

            double note5 = Math.divideExact(valueRequest,5);
            valueRequest %= 5;

            double note2 = Math.divideExact(valueRequest, 2);
            valueRequest %= 2;

            if (valueRequest != 0) {
                System.out.println("Não é possível sacar esse valor.");
            } else {
                System.out.println("Notas entregues:");
                System.out.println("Notas de 100: "+note100);
                System.out.println("Notas de 50: "+note50);
                System.out.println("Notas de 20: "+note20);
                System.out.println("Notas de 10: "+note10);
                System.out.println("Notas de 5: "+note5);
                System.out.println("Notas de 2: "+note2);
            }
        }
    }
}
