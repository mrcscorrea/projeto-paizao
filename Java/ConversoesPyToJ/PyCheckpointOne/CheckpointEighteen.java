package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CheckpointEighteen {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que deseja converter em reais e pressione ENTER: ");
        float valueRequest = sc.nextFloat();

        System.out.println("Escolha a moeda para conversão e pressione ENTER: ");
        System.out.println("1 - Dólar (USD)");
        System.out.println("2 - Euro (EUR)");
        System.out.println("3 - Libra (GBP)");

        System.out.println("Opção: ");
        int optionSelected = sc.nextInt();
        double convertido;
        String result;
        String unidade;

        switch (optionSelected) {
            case 1:
                convertido = valueRequest * 5.24;
                result = "dólar";
                unidade = "USD";
                System.out.println("Valor em "+result+ " "+convertido+" "+unidade);
                break;
            case 2:
                convertido = valueRequest * 6.04;
                result = "euro";
                unidade = "EUR";
                System.out.println("Valor em "+result+ " "+convertido+" "+unidade);
                break;
            case 3:
                convertido = valueRequest * 6.96;
                result = "libra";
                unidade = "GBP";
                System.out.println("Valor em "+result+ " "+convertido+" "+unidade);
            default:
                System.out.println("Opção inválida");

        }
    }
}
