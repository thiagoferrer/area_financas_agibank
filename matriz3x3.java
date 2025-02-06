/*Crie uma matriz 3x3 de números inteiro e preencha-a manualmente.
Em seguida, imprima os elementos da matriz de tabela.*/
package s3exercicios;

public class matriz3x3 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3}, //Linha 1
                {4, 5, 6}, //Linha 2
                {7, 8, 9}  //Linha 3
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
