/*Remover Duplicatas
Faça um programa que leia um vetor de 15 números inteiros e remova os números duplicados, mantendo apenas a primeira ocorrência de cada número.
*/
package pessoal_exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoverDuplicatas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            numeros[i] = scanner.nextInt();
        }

        ArrayList<Integer> listaSemDuplicatas = new ArrayList<>();
        HashSet<Integer> conjunto = new HashSet<>();

        for (int num : numeros) {
            if (conjunto.add(num)) { // Só adiciona se ainda não estiver no conjunto
                listaSemDuplicatas.add(num);
            }
        }

        System.out.println("Vetor sem duplicatas:");
        for (int num : listaSemDuplicatas) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
