package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Administrador implements Autenticavel {
    private String senha;
    private int codigo;

    public Administrador() {}
    public Administrador(String senha, int codigo) {
        this.senha = senha;
        this.codigo = codigo;
    }

    @Override
    public boolean autenticar(String s) {
        return this.senha.equals(s) && codigo == 1301;
    }
}
