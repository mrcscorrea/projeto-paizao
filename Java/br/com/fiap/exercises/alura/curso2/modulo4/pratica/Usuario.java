package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Usuario implements Autenticavel {
    private String senha;

    public Usuario() {}
    public Usuario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}
