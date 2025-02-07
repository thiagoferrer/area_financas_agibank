/*Ex10 - Implemente uma função para rotacionar uma matriz quadrada nxn em 90 graus no sentido horário
*
* Entrada:
* 1 2 3
* 4 5 6
* 7 8 9
*
* Saída:
* 7 4 1
* 8 5 2
* 9 6 3*/
package s3exercicios;

public class RotacionarMatriz90 {
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        // Passo 2: Criar uma matriz auxiliar para armazenar o resultado da rotação
        int[][] matrizRotacionada = new int[colunas][linhas];

        // Passo 3: Preencher a matriz rotacionada
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matrizRotacionada[j][linhas - 1 - i] = matriz[i][j];
            }
        }

        // Passo 4: Exibir a matriz rotacionada
        for (int i = 0; i < colunas; i++){
            for (int j = 0; j < linhas; j++){
                System.out.print(matrizRotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
