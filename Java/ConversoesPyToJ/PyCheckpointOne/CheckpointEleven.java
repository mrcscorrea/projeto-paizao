package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;
public class CheckpointEleven {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("JOGADOR 1! Escolha uma opção para jogar:\n\nPedra, Papel, Tesoura");
        String playerOneSelects = sc.next();

        System.out.println("JOGADOR 2! Escolha uma opção para jogar:\n\nPedra, Papel, Tesoura");
        String playerTwoSelects = sc.next();
        String winner;
        if (playerOneSelects.equalsIgnoreCase(playerTwoSelects)) {
            System.out.println("Ninguém ganhou, ambos colocaram igual.");
        }

        if (playerOneSelects.equalsIgnoreCase("PEDRA") && playerTwoSelects.equalsIgnoreCase("PAPEL") || playerOneSelects.equalsIgnoreCase("PAPEL") && playerTwoSelects.equalsIgnoreCase("PEDRA")) {
            winner = "PAPEL";
            System.out.println("Jogador 1 escolhe: "+ playerOneSelects+"\nJogador 2 escolhe: "+playerTwoSelects+"\n\n"+winner+" venceu!");
        } else if (playerOneSelects.equalsIgnoreCase("PEDRA") && playerTwoSelects.equalsIgnoreCase("TESOURA") || playerOneSelects.equalsIgnoreCase("TESOURA") && playerTwoSelects.equalsIgnoreCase("PEDRA")) {
            winner = "PEDRA";
            System.out.println("Jogador 1 escolhe: "+ playerOneSelects+"\nJogador 2 escolhe: "+playerTwoSelects+"\n\n"+winner+" venceu!");
        } else if (playerOneSelects.equalsIgnoreCase("PAPEL") && playerTwoSelects.equalsIgnoreCase("TESOURA") || playerOneSelects.equalsIgnoreCase("TESOURA") && playerTwoSelects.equalsIgnoreCase("PAPEL")) {
            winner = "TESOURA";
            System.out.println("Jogador 1 escolhe: "+ playerOneSelects+"\nJogador 2 escolhe: "+playerTwoSelects+"\n\n"+winner+" venceu!");
        }
    }
}
