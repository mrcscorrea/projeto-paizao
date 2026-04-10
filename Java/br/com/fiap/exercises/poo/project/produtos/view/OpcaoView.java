package br.com.fiap.exercises.poo.project.produtos.view;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class OpcaoView {
    public static Opcao select() {

        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null,
                "Selecione uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Opcao.values(),
                Opcao.CADASTRAR_PRODUTO);

        return ret != null ? ret : Opcao.ENCERRAR_SISTEMA;
    }
}
