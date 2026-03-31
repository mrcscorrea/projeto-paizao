package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CheckpointTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura e pressione ENTER: ");
        float tempSelect = sc.nextFloat();

        double tempInFahrenheit = tempSelect * 9/5 + 32;
        double tempInKelvin = tempSelect + 273.15;

        System.out.println("Digite a opção desejada para conversão\n\n1: Celsius    2: Fahrenheit    3: Kelvin\n\nDigite a opção desejada: ");
        int optionSelected = sc.nextInt();

        switch (optionSelected) {
            case 1:
                System.out.println("Sua temperatura " + tempSelect + " º em Celcius é de " + tempSelect + " ºC");
                break;
            case 2:
                System.out.println("Sua temperatura " + tempSelect + " º em Fahrenheit é de " + tempInFahrenheit + " ºF");
                break;
            case 3:
                System.out.println("Sua temperatura " + tempSelect + " º em Kelvin é de " + tempInKelvin + " ºK");
                break;

        }
    }
}
