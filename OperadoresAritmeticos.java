package br.com.fiap;

public class OperadoresAritmeticos {

    public static void main(String[] args){

        int x = 9;
        int y = 2;

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        int divisao = x / y;
        int moduloResto = x % y;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: "+ subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + moduloResto);

        x++;
        System.out.println("Resultado do Incremento: " + x);

        y--;
        System.out.println("Resultado do Decremento de y: " + y);

        x+=2;
        System.out.println("Resultado da soma de X com 2: " + x);

        y*=2;
        System.out.println("Resultado da multiplicação de y com 2: " + y);
    }
}
