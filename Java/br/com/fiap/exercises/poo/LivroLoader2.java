package br.com.fiap.exercises.poo;
import java.util.Scanner;
import java.util.ArrayList;

public class LivroLoader2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<AlunoLivro> alunos = new ArrayList<>();

        System.out.println("Quantos alunos deseja cadastrar: ");
        int qtdAlunos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            System.out.println("Digite o título do livro desejado: ");
            String tituloLivro = sc.nextLine();

            System.out.println("Digite o autor do livro desejado: ");
            String autorLivro = sc.nextLine();

            System.out.println("Por fim, digite o preço: ");
            float preco = sc.nextFloat();
            sc.nextLine();

            Livro livro = new Livro(tituloLivro, autorLivro, preco);
            AlunoLivro aluno = new AlunoLivro(nome, livro);

            alunos.add(aluno);

        }

        System.out.println("===  LISTA DE ALUNOS ===");
        for (AlunoLivro aluno : alunos) {
            aluno.estudar();
        }
        sc.close();
    }
}
