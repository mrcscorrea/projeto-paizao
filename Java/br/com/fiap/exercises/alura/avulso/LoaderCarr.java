package br.com.fiap.exercises.alura.avulso;
import java.util.Scanner;
public class LoaderCarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o preço do ano 1: ");
        double p1 = sc.nextDouble();

        System.out.println("Digite o preço do ano 2: ");
        double p2 = sc.nextDouble();

        System.out.println("Digite o preço do ano 3: ");
        double p3 = sc.nextDouble();
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.setModelo(modelo);
        meuCarro.setPrecoAno1(p1);
        meuCarro.setPrecoAno2(p2);
        meuCarro.setPrecoAno3(p3);
        meuCarro.puxarInformacoes();
    }
}
