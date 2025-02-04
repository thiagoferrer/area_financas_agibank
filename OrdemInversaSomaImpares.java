/*Ordem Inversa e Soma dos Índices Ímpares
Leia um vetor de 8 números inteiros e exiba os elementos na ordem inversa da inserção.
Além disso, calcule e exiba a soma dos elementos que estão em índices ímpares.*/
package pessoal_exercicios;

import java.util.Scanner;

public class OrdemInversaSomaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];

        // Leitura dos 8 números
        System.out.println("Digite 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        // Exibir os elementos na ordem inversa
        System.out.println("Elementos na ordem inversa:");
        for (int i = 7; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // Calcular a soma dos elementos nos índices ímpares
        int somaImpares = 0;
        for (int i = 1; i < 8; i += 2) {
            somaImpares += numeros[i];
        }

        // Exibir a soma dos elementos nos índices ímpares
        System.out.println("Soma dos elementos nos índices ímpares: " + somaImpares);
    }
}