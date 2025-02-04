/*Ordenação Crescente
Leia um vetor de 10 números inteiros e ordene-o em ordem crescente sem usar Arrays.sort(), apenas implementando sua própria lógica de ordenação (como o Bubble Sort).*/
package pessoal_exercicios;

import java.util.Scanner;

public class OrdenacaoCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leitura dos 10 números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        // Implementação do Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Exibir os números ordenados
        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
