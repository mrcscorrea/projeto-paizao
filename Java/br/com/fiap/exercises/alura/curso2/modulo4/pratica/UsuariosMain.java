package br.com.fiap.exercises.alura.curso2.modulo4.pratica;
import java.util.ArrayList;

public class UsuariosMain {
    public static void main(String[] args) {

        Autenticavel novoUsuario = new Usuario("1234");
        Autenticavel novoAdmin = new Administrador("1234", 1301);

        ArrayList<Autenticavel> list = new ArrayList<>();
        list.add(novoUsuario);
        list.add(novoAdmin);

        for (Autenticavel a : list) {
            a.autenticar("1234");
        }
    }
}
