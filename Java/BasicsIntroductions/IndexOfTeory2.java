package br.com.fiap;
import java.util.Scanner;

public class IndexOfTeory2 {
    static void main(String[] args) {
        Scanner oneScanner = new Scanner(System.in);
        IO.println("Digite seu nome completo e digite ENTER: ");
        String name = oneScanner.nextLine();

        if (name.indexOf(" ") == -1) {
            IO.println("O nome não está completo, digite o nome completo.");
        }
        oneScanner.close();
    }
}
