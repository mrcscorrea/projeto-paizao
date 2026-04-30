package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Usuario implements Autenticavel {
    private String senha;

    public Usuario() {}
    public Usuario(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senhaDigitada) {
        if (this.senha.equals(senhaDigitada)) {
            System.out.println("SENHA OK");
            return true;
        } else {
            System.out.println("SENHA INCORRETA");
            return false;
        }
    }
}
