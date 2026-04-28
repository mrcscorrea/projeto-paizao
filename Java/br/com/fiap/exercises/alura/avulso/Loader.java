package br.com.fiap.exercises.alura.avulso;
import java.util.Scanner;
public class Loader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro, vamos lhe cadastrar no banco.");
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu tipo de conta: Corrente/Poupança");
        String tipo = sc.nextLine();

        System.out.println("Digite o valor inicial a conta: ");
        double valor = sc.nextDouble();

        Cliente c = new Cliente(nome, tipo, valor);

        System.out.println("=== Banco Marcão ===");
        System.out.println("Nome: "+c.name);
        System.out.println("Tipo de conta: "+c.accountType);
        System.out.println("Saldo: R$"+c.getSaldo());
        System.out.println("=== 2026 ===\n\n");
        System.out.println("Digite a opção desejada:\n\n1: Consultar saldo\n2: Receber pix\n3: Realizar pix\n4: Sair");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Você possui R$" + c.getSaldo());
                break;
            case 2:
                System.out.println("Digite o valor a receber: ");
                double valorAReceber = sc.nextDouble();
                c.receberPix(valorAReceber);
                break;
            case 3:
                System.out.println("Digite o valor que deseja transferir: ");
                double valorATransferir = sc.nextDouble();
                c.transferirPix(valorATransferir);
                break;
            case 4:
                break;
        }
    }
}
