/*Elementos Únicos
Crie um programa que leia 10 números inteiros e armazene-os em um vetor.
Depois, exiba apenas os números que não se repetem.*/
package pessoal_exercicios;

import java.util.HashMap;
import java.util.Scanner;

public class ElementosUnicos {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        HashMap<Integer, Integer> contagem = new HashMap<>();

        // Leitura dos 10 números
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            contagem.put(numeros[i], contagem.getOrDefault(numeros[i], 0) + 1);
        }

        scanner.close();

        // Exibir os números que não se repetem
        System.out.println("Números que não se repetem:");
        boolean encontrouUnico = false;
        for (int num : numeros) {
            if (contagem.get(num) == 1) {
                System.out.print(num + " ");
                encontrouUnico = true;
            }
        }

        if (!encontrouUnico) {
            System.out.println("Nenhum número único encontrado.");
        } else {
            System.out.println();
        }
    }
}
