/* Receba uma matriz quadrada nxn e exiba os elementos da diagonal principal
 * Exemplo de Entrada:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Exemplo de Sáida:
 * Diagonal Principal: 1 5 9 */
package s3exercicios;

public class matrizQuadradaNxN {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matriz.length;

        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
