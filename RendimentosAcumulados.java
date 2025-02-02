package pessoal_exercicios;

import java.util.Scanner;

public class RendimentosAcumulados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados ao usuário
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do depósito fixo mensal: ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de rendimento mensal (em %): ");
        double taxaJuros = scanner.nextDouble() / 100; //Converte a taxa de juros para decimal.

        int meses = 12; // Período de 12 menses.

        //Calcula os rendimento ao longo dos 12 meses
        for(int i = 1; i <= meses; i++){
            saldo += depositoMensal; //Adiciona o depósito mensal
            saldo += saldo * taxaJuros; //Aplica o rendimento
        }

        //Exibe o saldo final após 12 meses
        System.out.printf("Saldo final após 12 meses: R$ %.2f%n", saldo);

        scanner.close();
    }
}
