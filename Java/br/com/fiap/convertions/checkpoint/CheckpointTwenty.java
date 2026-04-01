package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;

public class CheckpointTwenty {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de veículo (carro, moto, onibus, caminhao): ");
        String vehicleType = sc.next().toLowerCase();
        double value;

        switch (vehicleType) {
            case "carro":
                value = 6.6;
                System.out.println("Valor do pedágio: R$"+value);
                break;
            case "moto":
                value = 3.3;
                System.out.println("Valor do pedágio: R$"+value);
                break;
            case "onibus":
                value = 13.2;
                System.out.println("Valor do pedágio: R$"+value);
                break;
            case "caminhao":
                System.out.println("Digite a quantidade de eixos do caminhão e pressione ENTER: ");
                int eixos = sc.nextInt();
                if (eixos <= 2) {
                    value = 13.2;
                    System.out.println("Valor do pedágio: R$"+value);
                    break;
                } else if (eixos == 3) {
                    value = 19.8;
                    System.out.println("Valor do pedágio: R$"+value);
                    break;
                }
            default:
                System.out.println("Tipo de veículo inválido");
        }

        sc.close();
    }
}
