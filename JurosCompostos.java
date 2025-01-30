//Código Java para Juros Compostos (com ou sem aportes):
package pessoal_exercicios;

import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite o valor do capital inicial (R$): ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double taxa = scanner.nextDouble() / 100; // Convertendo para decimal

        System.out.print("Digite o tempo (meses): ");
        int tempo = scanner.nextInt();

        System.out.print("Digite o valor do aporte mensal (R$) (ou 0 para sem aporte): ");
        double aporte = scanner.nextDouble();

        // Cálculo do montante
        double montante;
        if (aporte == 0) {
            // Sem aportes
            montante = capital * Math.pow((1 + taxa), tempo);
        } else {
            // Com aportes mensais
            montante = capital * Math.pow((1 + taxa), tempo) +
                aporte * ((Math.pow((1 + taxa), tempo) - 1) / taxa);
        }

        double juros = montante - (capital + (aporte * tempo));

        // Saída de resultados
        System.out.printf("Juros acumulados: R$ %.2f%n", juros);
        System.out.printf("Montante final: R$ %.2f%n", montante);

        scanner.close();
    }
}
