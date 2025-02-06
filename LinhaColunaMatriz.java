/*Receba uma matriz nxm e um número inteiro. Verifique se o número está presente na matriz.
Caso esteja, exiba as posições(linha e coluna) onde o número aparece.
Exemplo de Entrada:
Matriz:
1 2 3
4 5 6
7 8 9

Exemplo de Sáida:
Número encontrado na posição: linha 2, coluna 2
Número: 5*/
package s3exercicios;

public class LinhaColunaMatriz {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int numero = 5;

        //verificar
        boolean encontrado = false;

        //Percorrer a matriz
        for (int i = 0; i < matriz.length; i++) { // percorrer linhas
            for (int j = 0; j < matriz[i].length; j++) { //percorrer colunas
                if (matriz[i][j] == numero) {
                    //exibir
                    System.out.println("Número encontrado na posíção: linha " + (i + 1) + ", coluna " + (j + 1));
                    encontrado = true; // marcar como encontrado
                }
            }
        }
        //Caso o número não seja encontrado
        if (!encontrado) {
            System.out.println("Número encontrado na matriz.");
        }
    }
}
