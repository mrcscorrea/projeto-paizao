package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class Administrador implements Autenticavel {
    private String senha;
    private int codigo;

    public Administrador() {}
    public Administrador(String senha, int codigo) {
        this.senha = senha;
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean autenticar(String s) {
        if (this.senha.equals(s) && codigo == 1301) {
            System.out.println("SENHA OK e CÓDIGO OK");
            return true;
        } else if (this.senha.equals(s)){
            System.out.println("SENHA OK e CÓDIGO INVÁLIDO");
            return false;
        } else {
            System.out.println("SENHA E CÓDIGO INVÁLIDOS");
            return false;
        }
    }
}
