//Cálculo de Taxas Bancárias
//Leia o saldo inicial de uma conta e calcule a taxa de manutenção (1% do saldo, mínimo de R$10).
//Exiba o saldo final após a taxa.
package s1exercicios;

import java.util.Scanner;

public class TaxasBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        double taxaManutencao = saldoInicial * 0.01;
        if(taxaManutencao < 10){
            taxaManutencao = 10;
        }
        double saldoFinal = saldoInicial - taxaManutencao;

        System.out.printf("Taxa de manutenção aplicada: R$ %.2f%n", taxaManutencao);
        System.out.printf("Saldo final após a taxa: R$ %.2f%n", saldoFinal);

        scanner.close();
    }
}
