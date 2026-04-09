package br.com.fiap;
import java.util.Scanner;
public class Loader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Cliente ===");
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite uma idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite um CPF: ");
        String cpf = sc.nextLine();

        System.out.println("Digite o gênero: ");
        String genero = sc.nextLine();

        System.out.println("Digite o código: ");
        int codigo = sc.nextInt();

        Cliente novoCliente = new Cliente(nome, idade, cpf, genero, codigo, 0);
        novoCliente.apresentar();

        sc.close();
    }
}
