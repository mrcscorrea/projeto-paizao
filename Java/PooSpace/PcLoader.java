package br.com.fiap;
import java.util.Scanner;

public class PcLoader {
    static void main(String[] args) {

        Scanner requests = new Scanner(System.in);

        System.out.println("Digite a placa de vídeo: ");
        String gpu = requests.nextLine();

        System.out.println("Digite a quantidade de Memória RAM: ");
        int ram = requests.nextInt();

        System.out.println("Digite o processador: ");
        String cpu = requests.nextLine();

        System.out.println("Digite o espaço do SSD: ");
        int qtdSsd = requests.nextInt();

        Computer pczao = new Computer();
        pczao.placaDeVideo = gpu;
        pczao.memoriaRam = ram;
        pczao.processador = cpu;
        pczao.espacoHd = qtdSsd;
    }
}
