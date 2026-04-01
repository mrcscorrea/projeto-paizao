package br.com.fiap.exercises.teory;
import java.util.Scanner;

public class LacoRepeticao {
    public static void main(String[] args) {
        Scanner oneScanner = new Scanner(System.in);
        int qtd = 0;
        double somaNotas = 0;
        int op;

        do {

            System.out.print("Digite a nota do aluno número " + qtd + ": ");
            float nota = oneScanner.nextFloat();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida!");

            } else {

                somaNotas += nota;
                qtd++;

            }

            System.out.println("Deseja adicionar mais uma nota?\n1: Sim   2: Não\n\nDigite a opção: ");
            op = oneScanner.nextInt();

        } while (op == 1);

        double media = somaNotas / qtd;

        System.out.println("A média da nota da turma é " + media);
        System.out.println("A quantidade de alunos da turma é " + qtd);

    }

}
