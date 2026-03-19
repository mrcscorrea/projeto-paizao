package desktop;

public class Pessoa {
   private String nome;
   private int idade;
   private final Carro carro;

    Pessoa(String nome, int idade, Carro carro) {
        setNome(nome);
        setIdade(idade);
        this.carro = carro;
    }

    String getNome() {
        return nome;
    }
    int getIdade() {
        return idade;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }

    void apresentar() {
        System.out.println("Olá meu nome é " + nome + " tenho " + idade + " anos e dirijo um " + carro.getModelo() );
    }
}
