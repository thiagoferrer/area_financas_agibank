/*Ex08 - Verifique se uma matriz quadrada nxn é uma matriz identidade.
 * Definição: Uma matriz identidade possui ls na diagonal principal e 0s em todos os outros elementos
 * Exemplo de Entrada:
 * 1 0 0
 * 0 1 0
 * 0 0 1
 *
 * Exemplo Sáida:
 * A matriz é uma identidade*/
package s3exercicios;

public class MatrizIdentidade {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        if (ehMatrizIdentidade(matriz)) {
            System.out.println("A matriz é uma identidade.");
        } else {
            System.out.println("A matriz NÃO é uma identidade.");
        }
    }

    public static boolean ehMatrizIdentidade(int[][] matriz) {
        int n = matriz.length;

        // Verificar se é uma matriz quadrada
        for (int[] linha : matriz) {
            if (linha.length != n) {
                return false;
            }
        }

        // Verificar os elementos da matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    return false;
                }
            }
        }

        return true;
    }
}
