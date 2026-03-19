package desktop;

import java.util.Scanner;

public class ExecutorPOO {
    public static void main(String[] args) {
        Scanner scaneador = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scaneador.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scaneador.nextInt();

        System.out.println("Digite a marca do carro que você usa: ");
        String marcaCarroUsado = scaneador.next();

        System.out.println("Digite o modelo do carro que você usa: ");
        String modeloCarroUsado = scaneador.next();

        System.out.println("Digite o ano do carro que você usa: ");
        int anoCarroUsado = scaneador.nextInt();

        Carro carrozin = new Carro(marcaCarroUsado, modeloCarroUsado, anoCarroUsado);

        Pessoa p1 = new Pessoa(nome, idade, carrozin);
        p1.apresentar();
    }

}


//    public static void main(String[] args) {
//
//        Scanner scaneador = new Scanner(System.in);
//
//        System.out.println("Digite a marca do carro: ");
//        String marca = scaneador.nextLine();
//
//        System.out.println("Digite o modelo do carro: ");
//        String modelo = scaneador.nextLine();
//
//        System.out.println("Digite o ano do carro: ");
//        int ano = scaneador.nextInt();
//
//
//        Carro carOne = new Carro(marca, modelo, ano);
//        if (carOne.ehBomba()) {
//
//            System.out.println("AH NÃO");
//            System.out.println("Não quero saber, é bomba");
//
//        } else {
//            System.out.println("Informação do carro: \nMarca: " + carOne.getMarca() + "\nModelo: " + carOne.getModelo() + "\nAno: " + carOne.getAno());
//        }
//
//        scaneador.close();
//    }
