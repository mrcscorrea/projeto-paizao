package br.com.fiap.exercises.poo;
import java.util.Scanner;

public class LivroLoader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=== REGISTRO DE LIVROS ===");
        System.out.println("Digite o título do livro a se registrar: ");
        String tituloLivro = sc.nextLine();

        System.out.println("Agora, digite o autor do livro: ");
        String autorLivro = sc.nextLine();

        System.out.println("Por fim, digite o preço que quer vender o livro: ");
        float precoLivro = sc.nextFloat();

        Livro novoLivro = new Livro(tituloLivro,autorLivro,precoLivro);
        System.out.println("Livro criado!");
        novoLivro.exibirLivro();

        System.out.println("Coloque a quantidade de desconto no livro: ");
        double discount = sc.nextDouble();
        sc.nextLine();

        novoLivro.aplicarDesconto(discount);
        System.out.println("Desconto aplicado!");
        novoLivro.exibirLivro();

        System.out.println("=== LEITURA DE LIVROS ===");
        System.out.println("Digite o nome do aluno: ");
        String aluno = sc.nextLine();

        AlunoLivro alunoNovo = new AlunoLivro(aluno, novoLivro);
        alunoNovo.estudar();
    }
}
