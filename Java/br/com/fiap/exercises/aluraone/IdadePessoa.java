package exercises.aluraone;

public class IdadePessoa {
    private String nome;
    private int idade;

    public IdadePessoa() {}

    public IdadePessoa(String n, int i) {
        setNome(n);
        setIdade(i);
    }

    public String getNome() {
        return this.nome;
    }

    void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    void setIdade(int i) {
        this.idade = i;
    }


    public void verificarIdade() {
        if (getIdade() < 0) {
            System.out.println("Idade inválida");
        }
        if (getIdade() < 18) {
            System.out.println(getNome()+" é menor de idade.");
        } else {
            System.out.println(getNome()+" é maior de idade.");
        }
    }
}
