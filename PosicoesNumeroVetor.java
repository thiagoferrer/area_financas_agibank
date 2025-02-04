/*Posições de um Número no Vetor
Leia um vetor de 10 números inteiros e um número X.
Informe em quais posições X aparece no vetor.
Caso X não esteja presente, exiba uma mensagem informando que o número não foi encontrado.*/
package pessoal_exercicios;

import java.util.Scanner;

public class PosicoesNumeroVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leitura dos 10 números
        System.out.print("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Leitura do número X
        System.out.print("Digite um número X para buscar no vetor: ");
        int x = scanner.nextInt();

        scanner.close();

        // Procurar as posições de X no vetor
        boolean encontrado = false;
        System.out.print("O número " + x + " aparece nas posições: ");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == x) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + x + " não foi encontrado no vetor.");
        } else {
            System.out.println();
        }
    }
}


