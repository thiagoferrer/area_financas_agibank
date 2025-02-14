/*Ex02 - Média dos gastos mensais: um usuário acompanha seus gastos mensair em um vetor de 12 posições. Seu objetivo é calcular:
*
* 1 - O gastos médio mensal.
* 2 - Quantos meses tiveram gastos acima da média.
*
* Exemplo de Entrada: gastos mensais
* 1200 1350 110 1250 1400 1300 1250 1400 1500 1600 1550 1650
*
* Saida Esperada:
* Média de gastos: 1400.00
* Meses acima da média: 5*/
package s4exercicios.Ex17;

public class MediaGastosMensais {
    public static void main(String[] args) {
        double[] gastosMensais = {1200, 1350, 1100, 1250, 1400, 1300, 1250, 1400, 1500, 1600, 1550, 1650};
        System.out.printf("Média: %.2f", gastosMedio(gastosMensais));
        System.out.println();
        System.out.printf("Meses acima da média: %d", mesesAcima(gastosMensais));
    }

    public static double gastosMedio(double[] gastosMensais) {
        double gastoMedio = 0;
        for (double m : gastosMensais) {
            gastoMedio = gastoMedio + m; //Somando tudo
        }
        double resultado = gastoMedio / gastosMensais.length; //média

        return resultado;
    }

    public static int mesesAcima(double[] gastosMensais) {
        int contador = 0;
        for (double c : gastosMensais) {
            if (c > gastosMedio(gastosMensais)) {
                contador++;
            }
        }
        return contador;
    }
}
