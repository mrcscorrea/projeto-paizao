package br.com.fiap.convertions.functions.one;
import java.util.Scanner;
public class FuncaoOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1 e pressione ENTER: ");
        float notaOne = sc.nextFloat();

        System.out.println("Digite a nota 2 e pressione ENTER: ");
        float notaTwo = sc.nextFloat();

        Calculo c1 = new Calculo(notaOne, notaTwo);
        c1.calcularMedia();
    }


}
