package br.com.fiap.ConversoesPyToJ.ifElseQuestions;
import java.util.Scanner;

public class IfElseQuestionThree {
    public static void main(String[] args) {

        Scanner scannerOne = new Scanner(System.in);

        System.out.print("Digite uma temperatura desejada em Celsius: ");
        float tempInCelsius = scannerOne.nextFloat();

        double tempInFahrenheit = tempInCelsius * 9/5 + 32;
        double tempInKelvin = tempInCelsius + 273.15;

        System.out.print("Digite a opção desejada para conversão:\n\n1: Fahrenheit    2: Kelvin\nDigite a opção: ");
        int opcao = scannerOne.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Sua temperatura " + tempInCelsius + " ºC em Fahrenheit é de " + tempInFahrenheit + " ºF");
                break;
            case 2:
                System.out.println("Sua temperatura " + tempInCelsius + " ºC em Kelvin é de " + tempInKelvin + " ºK");
                break;
        }

    }

}