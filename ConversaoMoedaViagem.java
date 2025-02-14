/*Ex05 - Conversao de Moeda para viagem: Um turista deseja converter valores em reais para dólares ao longo de 7 dias.
 * O programa deve:
 *
 * 1 - criar um vetor com os valores gastos em reais por dia.
 * 2 Converter cada valor para dólares usando uma taxa fixa informada pelo usuário.
 * Entrada:
 * - Um valor de 7 valores (gastos diários em reais).
 * - Uma taxa de câmbio(float).
 *
 * Saída:
 * vetor com 7 valores convertidos para dólares*/
package s4exercicios.Ex20;

import java.util.Scanner;

public class ConversaoMoedaViagem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] gastosReais = new double[7];
        double[] gastosDolares = new double[7];

        System.out.println("Digite os valores gastos em reais para os 7 dias da viagem:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            gastosReais[i] = scanner.nextDouble();
        }

        System.out.print("Informe a taxa de câmbio (R$ para US$): ");
        double taxaCambio = scanner.nextDouble();

        for (int i = 0; i < 7; i++) {
            gastosDolares[i] = converterParaDolares(gastosReais[i], taxaCambio);
        }

        System.out.println("\nValores convertidos para dólares:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Dia %d: R$%.2f -> $%.2f%n", (i + 1), gastosReais[i], gastosDolares[i]);
        }

        scanner.close();
    }

    public static double converterParaDolares(double valorReais, double taxaCambio) {
        return valorReais / taxaCambio;
    }
}
