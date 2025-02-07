/* Ex09 - Dada uma matriz nxm de números reais, normalize os valores, dividindo cada elemento pelo maior valor presente na matriz
* Exemplo de Entrada:
* 2.0 4.0 6.0
* 8.0 10.0 12.0
*
* Exemplo de Saída:
* 0.17 0.33 0.50
* 0.67 0.83 1.00*/
package s3exercicios;

public class DividindoMatriz {
    public static void main(String[] args) {
        double [][] matriz = {
                {2.0, 4.0, 6.0},
                {8.0, 10.0, 12.0}
        };

        int linhas = matriz.length;
        int colunas = matriz[0].length;

        double maiorValor = Double.MIN_VALUE;

        //encontrar o maior valor na matriz
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                if (matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                }
            }
        }

        //Dividir cada elemento pelo maior valor
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matriz[i][j] = matriz[i][j] / maiorValor;
            }
        }

        //Exibir
        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.printf("%.2f ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
