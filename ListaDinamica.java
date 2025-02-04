package pessoal_exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaDinamica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(); // Lista dinâmica

        // Entrada do usuário
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero); // Adiciona na lista
        }

        // Exibir os números digitados
        System.out.println("\nNúmeros digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // Ordenar os números
        Collections.sort(numeros);
        System.out.println("\nLista ordenada: " + numeros);

        // Buscar um número específico
        System.out.print("\nDigite um número para buscar: ");
        int busca = scanner.nextInt();

        if (numeros.contains(busca)) {
            System.out.println("O número " + busca + " está na lista.");
        } else {
            System.out.println("O número " + busca + " NÃO está na lista.");
        }

        scanner.close();
    }
}

/*Explicação
1 - Criamos um ArrayList<Integer>, que é uma lista dinâmica de números inteiros.
2 - O usuário digita 5 números, que são adicionados à lista.
3 - Exibimos os números digitados.
4 - Ordenamos os números usando Collections.sort().
5 - Permitimos que o usuário pesquise um número na lista.
6 - Usamos numeros.contains(valor) para verificar se o número está na lista.*/

