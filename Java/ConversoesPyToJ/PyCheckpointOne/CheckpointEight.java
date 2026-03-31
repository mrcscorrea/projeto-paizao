package br.com.fiap.ConversoesPyToJ.PyCheckpointOne;
import java.util.Scanner;

public class CheckpointEight {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu salário e pressione ENTER: ");
        double salary = sc.nextDouble();
        
        double freeImpost = 2200;
        double withImpostMin = 2200.01;
        double withImpostMax = 3102.99;
        double impost = 0;
        double salaryTotal = salary * impost;
        
        if (salary <= freeImpost) {
            System.out.println("Seu salário " + salary + " está livre de impostos.");
        } else if (withImpostMin <= salary || salary < withImpostMax) {
            impost = 0.075;
            salaryTotal = salary * (1 - impost);
            System.out.println("Seu salário " + salary + " tomou impostos de " + impost*100 + "%, logo o seu salário ficou em " + salaryTotal);
        } else if (withImpostMax <= salary) {
            impost = 0.1;
            salaryTotal = salary * (1-impost);
            System.out.println("Seu salário " + salary + " tomou impostos de " + impost*100 + "%, logo o seu salário ficou em " + salaryTotal);
        }
    }
}
