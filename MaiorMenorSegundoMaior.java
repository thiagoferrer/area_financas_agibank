/*Maior, Menor e Segunda Maior Valor
Crie um programa que leia 12 números inteiros e armazene-os em um vetor.
Depois, exibe o maior, o menor e o segundo maior número encontrado no vetor.*/
package pessoal_exercicios;

public class MaiorMenorSegundoMaior {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2};
        int maior = vetor[0];
        int menor = vetor[0];
        int segundoMaior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                segundoMaior = maior;
                maior = vetor[i];
            } else if (vetor[i] > segundoMaior) {
                segundoMaior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Segundo Maior: " + segundoMaior);
    }
}
