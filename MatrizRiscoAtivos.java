/*Ex07 */
package s4exercicios.Ex22;

public class MatrizRiscoAtivos {
    public static void main(String[] args) {

        double[][] matrizRisco = {
                {1.0, 1.2, 1.1, 1.3},
                {0.9, 1.0, 1.1, 1.2},
                {1.5, 1.6, 1.4, 1.3}
        };
        double[] resultado = somarModuloVariacoes(matrizRisco);
        for (double soma : resultado) {
            System.out.printf("%.2f ", soma);
        }
    }

    public static double[] somarModuloVariacoes(double[][] matriz) {
        double[] vetorSomaVariacoes = new double[matriz.length]; // armazenar o resultado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                vetorSomaVariacoes[i] += Math.abs(matriz[i][j + 1] - matriz[i][j]);
            }
        }
        return vetorSomaVariacoes;
    }
}
