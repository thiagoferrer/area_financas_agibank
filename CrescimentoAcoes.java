/*Ex02 - Receba os valores de ações de um ativo referente a 5 dias de negociação.
Calcule o crescimento percentual em 5 dias.
Considere: crescimento diário = ((valor atual - valor anterior) / valor anterior).*/
package s3exercicios;

import java.util.Scanner;

public class CrescimentoAcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];

        // Recebendo os valores de entrada
        System.out.println("Digite os valores do ativo para 5 dias de negociação:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        // Calculando o crescimento percentual em 5 dias
        double crescimentoPercentual = ((valores[4] - valores[0]) / valores[0]) * 100;

        // Exibindo o resultado
        System.out.printf("Crescimento percentual em 5 dias: %.2f%%\n", crescimentoPercentual);

        scanner.close();
    }
}
