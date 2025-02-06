/*Ex03 - Cálculo da média móvel de um ativo
A média móvel de um ativo financeiro é usada para suavizar flutuações de curto prazo e identificar tendências.
Crie um programa java que:
- Receba os preços de um ativo nos últimos 7 dias.
- Calcule a média móvel simples dos últimos 3 dias.
Entrada de Exemplo:
Preços: {100.0, 102.0, 101.0,  103.0, 105.0, 106.0, 108.0}
Saída Esperada:
Média móvel dos últimos 3 dias: 106.33*/
package s3exercicios;

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[7];

        System.out.println("Digite os preços do ativo nos últimos 7 dias:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        scanner.close();

        // Calculando a média móvel simples dos últimos 3 dias
        double soma = precos[4] + precos[5] + precos[6];
        double mediaMovel = soma / 3;

        System.out.printf("Média móvel dos últimos 3 dias: %.2f\n", mediaMovel);
    }
}

