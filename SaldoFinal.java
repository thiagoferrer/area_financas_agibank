//Saldo Final Após Depósito
//Leia o saldo inicial de uma conta bancária e um valor de depósito, exibindo o saldo final após o
//depósito.
package s1exercicios;

import java.util.Scanner;

public class SaldoFinal {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();

        double saldoFinal = saldoInicial + deposito;

        System.out.printf("O saldo final após o depósito é: R$ %.2f%n", saldoFinal);

        scanner.close();
    }
}
