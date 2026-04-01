package br.com.fiap.convertions.checkpoint;
import java.util.Scanner;

public class CheckpointSeventeen {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código HTTP que apareceu na tela e pressione ENTER: ");
        int httpCode = sc.nextInt();
        String result;

        switch (httpCode) {
            case 200:
                result = "OK";
                System.out.println(httpCode + " - " + result);
                break;
            case 400:
                result = "Bad Request";
                System.out.println(httpCode + " - " + result);
                break;
            case 401:
                result = "Unauthorized";
                System.out.println(httpCode + " - " + result);
                break;
            case 403:
                result = "Forbidden";
                System.out.println(httpCode + " - " + result);
                break;
            case 404:
                result = "Not Found";
                System.out.println(httpCode + " - " + result);
                break;
            case 500:
                result = "Internal Server Error";
                System.out.println(httpCode + " - " + result);
                break;
            default:
                System.out.println("Código inválido ou não cadastrado");
                break;
        }
    }
}
