/*Ex07 - Receba uma matriz quadrada nxn e calcula a soma dos elementos da diagonal principal e diagonal secundaria.
* Entrada:
* 1 2 3
* 4 5 6
* 7 8 9
*
* Saída:
* Soma da Diagonal Principal: 15
* Soma da Diagonal Secundaria: 15*/
package s3exercicios;

public class PrincipalSecundaria {
    public static void main(String[] args) {
        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int tamanhoDaMatriz = matriz.length;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        for (int i = 0; i < tamanhoDaMatriz; i ++){
            somaDiagonalPrincipal = somaDiagonalPrincipal + matriz[i][i]; 
            somaDiagonalSecundaria = somaDiagonalSecundaria + matriz[i][tamanhoDaMatriz - i - 1];
        }

        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundaria: " + somaDiagonalSecundaria);
    }
}
