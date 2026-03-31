package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CheckpointTen {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma coordenada X e pressione ENTER: ");
        float coordX = sc.nextFloat();

        System.out.println("Digite uma coordenada  Y e pressione ENTER: ");
        float coordY = sc.nextFloat();

        boolean Q1 = coordX > 0 && coordY > 0;
        boolean Q2 = coordX < 0 && coordY > 0;
        boolean Q3 = coordX < 0 && coordY < 0;
        boolean Q4 = coordX > 0 && coordY < 0;
        boolean origin = coordX == 0 && coordY == 0;
        String quadrante;
        if (Q1) {
            quadrante = "primeiro quadrante";
            System.out.println("Suas coordenadas " + coordX + " e " + coordY + " estão no " + quadrante);
        } else if (Q2) {
            quadrante = "segundo quadrante";
            System.out.println("Suas coordenadas " + coordX + " e " + coordY + " estão no " + quadrante);
        } else if (Q3) {
            quadrante = "terceiro quadrante";
            System.out.println("Suas coordenadas " + coordX + " e " + coordY + " estão no " + quadrante);
        } else if (Q4) {
            quadrante = "quarto quadrante";
            System.out.println("Suas coordenadas " + coordX + " e " + coordY + " estão no " + quadrante);
        } else if (origin) {
            System.out.println("Suas coordenadas " + coordX + " e " + coordY + " dão na origem");
        } else {
            System.out.println("Suas coordenadas " + coordX + " e " + coordY + " não dão em lugar nenhum");
        }
    }
}
