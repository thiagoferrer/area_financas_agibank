/*Receba uma matriz 4x4 de números inteiros e calcule:
 * 1 - A soma de todos os elementos da matriz.
 * 2 - A soma dos elementos de cada linha.
 * 3 - A soma dos elementos de cada coluna*/
package s3exercicios;

public class matriz4x4 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int somaTotal = 0;

        //Soma de todos elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                somaTotal = somaTotal + matriz[i][j];
            }
        }

        //Soma dos elementos de cada linha
        System.out.println("Soma dos elementos de cada linha:");
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                somaLinha = somaLinha + matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }

        //Soma dos elementos de cada coluna
        System.out.println("Soma dos elementos de cada coluna:");
        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }

        //Exibição
        System.out.println("A soma de todos os elementos da matriz: " + somaTotal);
    }
}
