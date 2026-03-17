package br.com.fiap.BasicsIntroductions;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner varScanner = new Scanner(System.in);
        System.out.print("Bem-vindo ao Administrativo.\n\nDigite uma opção:\n\n1: Cadastrar usuário\n2: Ver usuários ativos\n3:Cadastrar empresa parceira\n4: Ver empresas parceiras\n\nDigite a opção desejada: ");
        int option = varScanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Usuário a cadastrar...");
                break;
            case 2:
                System.out.println("Usuários cadastrados:\n\nMarcos\nHeitor\nCaio");
                break;
            case 3:
                System.out.println("Empresa a cadastrar...");
                break;
            case 4:
                System.out.println("Empresas cadastradas:\n\nNuBank\nInter\nCaixa Econômica Federal");
                break;
            default:
                //Nada
        }

        varScanner.close();

    }

}
