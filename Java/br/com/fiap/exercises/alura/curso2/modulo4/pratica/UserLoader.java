package br.com.fiap.exercises.alura.curso2.modulo4.pratica;

public class UserLoader {
    public static void main(String[] args) {

        Autenticavel user = new Usuario("1234");
        Autenticavel admin = new Administrador("1234",1301);

        if (user.autenticar("1234")) {
            System.out.println("Usuário logado!");
        } else {
            System.out.println("Usuário falhou ao logar.");
        }

        if (admin.autenticar("1234")) {
            System.out.println("Admin logado!!");
        } else {
            System.out.println("Admin falhou ao logar");
        }
    }
}
