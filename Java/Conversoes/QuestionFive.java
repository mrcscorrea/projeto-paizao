package br.com.fiap.Conversoes;
import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {

        Scanner scannerOne = new Scanner(System.in);

        String dbUser = "admin";
        String dbPassword = "1234";
        int loginTry = 4;


        System.out.print("Digite o usuário: ");
        String userRequest = scannerOne.next();

        while (!userRequest.equals(dbUser)) {

            System.out.println("Usuário incorreto! Digite novamente: ");
            userRequest = scannerOne.next();

        }

        System.out.println("Usuário correto!");

        System.out.println("Digite a senha: ");
        String passRequest = scannerOne.next();

        while (!passRequest.equals(dbPassword) && loginTry > 0) {

            loginTry--;

            if (loginTry == 0) {

            System.out.println("Você excedeu o limite de tentativas.");
            return;

            }

            System.out.println("Senha incorreta! você tem " + loginTry + "/3 tentativas.");
            passRequest = scannerOne.next();

        }

        System.out.println("Acesso liberado!");

    }

}


