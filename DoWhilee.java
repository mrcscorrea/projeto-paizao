package br.com.fiap;
import java.util.Scanner;

public class DoWhilee {
    public static void main(String[] args){
        Scanner oneScanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("Produto cadastrado!");
            System.out.print("Deseja cadastrar mais um produto?\n\n1: Sim\n2: Não\n\nDigite a opção desejada: ");

            op = oneScanner.nextInt();
        } while (op == 1);

    }

}
