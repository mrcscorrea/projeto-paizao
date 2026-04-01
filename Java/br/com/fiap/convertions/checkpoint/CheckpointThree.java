package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;

public class CheckpointThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor a ser pago e pressione ENTER: ");
        int valueRequest = sc.nextInt();

        System.out.println("Digite a forma de pagamento que deseja e pressione ENTER: \n\n1: À vista no PIX     2: Cartão de Crédito 1x     3: Cartão de Crédito Parcelado");
        int optionSelect = sc.nextInt();

        String paymentSelect;
        double discount;

        switch (optionSelect) {
            case 1:
                paymentSelect = "à vista no pix";
                discount = valueRequest * 0.9;
                System.out.println("Você pagou " + paymentSelect + " um total de R$" + discount);
                break;
            case 2:
                paymentSelect = "no cartão de crédito";
                discount = valueRequest;
                System.out.println("Você pagou " + paymentSelect + " um total de R$" + discount);
                break;
            case 3:
                paymentSelect = "no cartão de crédito parcelado";
                discount = valueRequest * 1.05;

                System.out.println("Digite a quantidade de parcelas para parcelar e pressione ENTER: ");
                int qtdParcelas = sc.nextInt();

                double totalValue = discount / qtdParcelas;
                System.out.println("Você pagou " + paymentSelect + " em " + qtdParcelas + "x um total de R$" + totalValue + " por mês");
        }
    }
}
