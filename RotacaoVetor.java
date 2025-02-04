/*Rotação do Vetor
Leia um vetor de N números inteiros e um número K.
Gire o vetor K posições para a direita.
Por exemplo, se o vetor for {1, 2, 3, 4, 5} e K = 2, o vetor resultante deve ser {4, 5, 1, 2, 3}.*/
package pessoal_exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class RotacaoVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int N = scanner.nextInt();
        int[] vetor = new int[N];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < N; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o número de posições para rotacionar: ");
        int K = scanner.nextInt();

        K = K % N; // Para evitar rotações desnecessárias

        if (K > 0) {
            rotacionarVetor(vetor, K);
        }

        System.out.println("Vetor rotacionado: " + Arrays.toString(vetor));

        scanner.close();
    }

    public static void rotacionarVetor(int[] vetor, int K) {
        int N = vetor.length;
        int[] temp = new int[N];

        for (int i = 0; i < N; i++) {
            temp[(i + K) % N] = vetor[i];
        }

        System.arraycopy(temp, 0, vetor, 0, N);
    }
}
