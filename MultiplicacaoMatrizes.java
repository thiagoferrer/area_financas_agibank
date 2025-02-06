/* Implemente a multiplicação de duas matrizes A e B, sendo A de dimensões mxn e B dimensões nXp.
Verifique se a multiplicação é possível antes de realizar o cálculo.*/
package s3exercicios;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {

        int m = 3;
        int n = 2;
        int p = 4;

        int[][] A = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] B = {
                {7, 8, 9, 10},
                {11, 12, 13, 14}
        };

        //Multiplicação
        if (A[0].length != B.length) {
            System.out.println("Multiplicação impossével: o número de colunas de A deve ser igual ao número de linhas de B.");
        } else {
            int[][] resultado = new int[m][p];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    resultado[i][j] = 0; //inicializa célula
                    for (int k = 0; k < n; k++) {
                        resultado[i][j] += A[i][k] * B[k][j]; //soma os produtos
                    }
                }
            }
            //exibir o resultado
            System.out.println("Matriz resultante da multiplicação:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.println(resultado[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
