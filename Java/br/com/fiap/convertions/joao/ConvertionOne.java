//O usuário informa o valor que deseja investir e o prazo em meses. Se o prazo for superior a 12 meses,
// a taxa de rendimento será de 12% ao ano. Caso contrário, será de 8% ao ano.
// O programa deve exibir qual taxa será aplicada.

package br.com.fiap.convertions.joao;

import java.util.Scanner;

public class ConvertionOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("== Sistema de Investimento ==");
        System.out.println("Informe o valor para investimento e pressione ENTER: ");
        double value = sc.nextDouble();

        System.out.println("Agora informe o prazo em meses e pressione ENTER: ");
        int prazo = sc.nextInt();
        int tax;

        if (prazo >= 12) {
            tax = 12;
        } else {
            tax = 8;
        }
        double totalValue = value - (1 - value * tax/100);
        System.out.println("Você receberá com taxa de "+tax+"%");
        System.out.println("O valor R$"+value+" com acréscimo de "+tax+"% fica R$"+totalValue);
    }
}
