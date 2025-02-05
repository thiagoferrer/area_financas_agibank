//Verificação de Limite de Saque
//Leia o saldo de uma conta e o valor de um saque.
//Exiba se o saque é permitido (saldo ≥ valor do saque).
package s1exercicios;

import java.util.Scanner;

public class VerificacaoSaque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do saque: ");
        double saque = scanner.nextDouble();

        if (saque <= saldo){
            saldo -= saque;
            System.out.printf("Saque realizado com sucesso! Saldo restante: R$ %.2f%n", saldo);
        }else {
            System.out.println("Saque negado! Saldo insuficiente.");
        }
        scanner.close();
    }

}
