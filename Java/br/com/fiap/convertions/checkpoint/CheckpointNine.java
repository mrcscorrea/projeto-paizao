package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;

public class CheckpointNine {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número decimal e pressione ENTER: ");
        float decimalOne = sc.nextFloat();

        System.out.println("Digite outro número decimal e pressione ENTER: ");
        float decimalTwo = sc.nextFloat();

        System.out.println("Digite a opção desejada para realizar a operação:\n\n+ = Soma    - = Subtração    * = Multiplicação    / = Divisão");
        String operation = sc.next();
        String operacao;
        double result;

        switch (operation) {
            case "+":
                operacao = "soma";
                result = decimalOne + decimalTwo;
                System.out.println("Sua " + operacao + " entre " + decimalOne + " e " + decimalTwo + " resultará em " + result);
                break;
            case "-":
                operacao = "subtração";
                result = decimalOne - decimalTwo;
                System.out.println("Sua " + operacao + " entre " + decimalOne + " e " + decimalTwo + " resultará em " + result);
                break;
            case "*":
                operacao = "multiplicação";
                result = decimalOne * decimalTwo;
                System.out.println("Sua " + operacao + " entre " + decimalOne + " e " + decimalTwo + " resultará em " + result);
                break;
            case "/":
                operacao = "divisão";
                result = decimalOne / decimalTwo;
                System.out.println("Sua " + operacao + " entre " + decimalOne + " e " + decimalTwo + " resultará em " + result);

                double reminder = decimalOne % decimalTwo;
                if (reminder > 0) {
                    System.out.println("Sua " + operacao + "teve resto.");
                } else {
                    System.out.println("Sua " + operacao + "não teve resto.");
                }
        }
    }
}
