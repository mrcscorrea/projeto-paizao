package br.com.fiap.exercises.poo;
import java.util.Scanner;

public class SerasaLoader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cadastro de Pessoa SERASA ===");

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Agora digite sua idade: ");
        int idade = sc.nextInt();

        Serasa pessoa1 = new Serasa(nome,idade,false);
        pessoa1.consultarNome();
    }
}
