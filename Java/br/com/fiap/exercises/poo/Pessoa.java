package br.com.fiap;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String genero;

    public Pessoa() {}
    public Pessoa(String nome, int idade, String cpf, String genero) {
       setNome(nome);
       setIdade(idade);
       setCpf(cpf);
       setGenero(genero);
    }

    String getNome() {
        return nome;
    }
    int getIdade() {
        return idade;
    }
    String getCpf() {
        return cpf;
    }
    String getGenero() {
        return genero;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
    void setIdade(int idade) {
        this.idade = idade;
    }
    void setCpf(String cpf) {
        this.cpf = cpf;
    }
    void setGenero(String genero) {
        this.genero = genero;
    }
}
