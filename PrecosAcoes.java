/*Ex04 - Crie um programa que receba os preços de fechamento de uma ação durante 10 dias e identifique:
- O maior preço atingindo.
- O menor preço registrado.
Entrada de Exemplo:
Preços: {98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0, 108.5, 106.0, 109.5}
Saída Esperada:
Maior preço: 110.0
Menor preço: 98.5*/
package s3exerciciosVetores;

import java.util.Arrays;

public class PrecosAcoes {
    public static void main(String[] args) {
        double[] precos = {98.5, 102.0, 100.5, 101.0, 105.0, 107.5, 110.0, 108.5, 106.0, 109.5};

        double maiorPreco = Arrays.stream(precos).max().orElse(Double.NaN);
        double menorPreco = Arrays.stream(precos).min().orElse(Double.NaN);

        System.out.println("Maior preço: " + maiorPreco);
        System.out.println("Menor preço: " + menorPreco);
    }
}

