/*Dada uma matriz mxn, calcule e exiba a matriz transposta.
 * Exemplo de Entrada:
 * 1 2 3
 * 4 5 6
 *
 * Exemplo de Saída:
 * 1 4
 * 2 5
 * 3 6*/
package s3exercicios;

public class MatrizTransporta {
    public static void main(String[] args) {

        // 2x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int m = matriz.length;    //numero de linhas (2)
        int n = matriz[0].length; //numero de colunas (3)

        int[][] matrizTransposta = new int[n][m]; // criando a transporta 3x2

        //transposição
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        //exibir transposta
        System.out.println("Matriz Transposta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
