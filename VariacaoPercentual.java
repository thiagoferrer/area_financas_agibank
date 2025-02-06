/*Ex05 - Crie um programa que receba um vetor com os preços diários de uma ação durante 5 dias e calcule a variação percentual diária.
Fórmula: variação = ((valor atual - valor anterior) / valor anterior) * 100
Entrada de exemplo:
Preços: {100.0, 101.5, 99.0, 102.0, 105.0}
Saída Esperada:
Variações diárias: {1.50%, -2.46%, 3.03%, 2.94%}*/
package s3exercicios;

import java.text.DecimalFormat;

public class VariacaoPercentual {
    public static void main(String[] args) {
        double[] precos = {100.0, 101.5, 99.0, 102.0, 105.0};
        double[] variacoes = calcularVariacoes(precos);

        System.out.print("Variações diárias: { ");
        DecimalFormat df = new DecimalFormat("0.00");
        for (int i = 0; i < variacoes.length; i++) {
            System.out.print(df.format(variacoes[i]) + "%");
            if (i < variacoes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static double[] calcularVariacoes(double[] precos) {
        double[] variacoes = new double[precos.length - 1];
        for (int i = 1; i < precos.length; i++) {
            variacoes[i - 1] = ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100;
        }
        return variacoes;
    }
}