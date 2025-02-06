/*Identificação de Dias de Alta e Queda
* Crie um programa que receba um vetor com os preços diários de uma ação durante 10 dias e identifique:
*
* Quantos dias tiveram alta(preço maior que o do dia anterior).
* Quantos dias tiveram queda (preço menor que o do dia anterior).
*
* Entrada de Exemplo:
* Preços: [100.0, 102.5, 101.0, 103.5, 105.0, 106.0, 108.5, 107.0, 109.5, 110.0]
*
* Saída Esperada:
* Dias de alta: 7
* Dias de queda: 2*/
package s3exercicios;

public class AnaliseAcoes {
    public static void main(String[] args) {
        double[] precos = {100.0, 102.5, 101.0, 103.5, 105.0, 106.0, 108.5, 107.0, 109.5, 110.0}; // Declarar o vetor de preços

        //inicializar os contadores
        int diasAlta = 0;
        int diasQueda = 0;

        //Percorrer o vetor usando um loop
        for(int i = 1; i < precos.length; i++){ //Começa no indíce 1 (Segundo dia)
            if(precos[i] > precos[i -1 ]){
                diasAlta++;
            } else if (precos[i] < precos[i -1]){
                diasQueda++;
            }
        }

        //Exibir os resultados
        System.out.println("Dias de alta: " + diasAlta);
        System.out.println("Dias de queda: " + diasQueda);
    }
}
