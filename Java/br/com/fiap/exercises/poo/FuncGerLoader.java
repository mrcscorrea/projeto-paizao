package br.com.fiap.exercises.poo;

public class FuncGerLoader {
    public static void main(String[] args) {

        Gerente marcao = new Gerente();
        marcao.nome = "Marcos";
        marcao.salario = 2100;
        marcao.bonus = 500;

        System.out.println("Seu salário agora é de R$"+marcao.calcularSalario());
    }
}
