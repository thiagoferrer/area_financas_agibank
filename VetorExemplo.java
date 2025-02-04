package pessoal_exercicios;

import java.util.Arrays;

public class VetorExemplo {
    public static void main(String[] args) {
        // 1. Declaração e Inicialização
        int[] numeros = new int[5]; // Vetor de 5 posições

        // 2. Atribuição de Valores
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // 3. Acessando Elementos Individualmente
        System.out.println("Primeiro elemento: " + numeros[0]); // Saída: 10

        // 4. Percorrendo o Vetor com for tradicional
        System.out.println("Percorrendo com for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // 5. Percorrendo com for-each (foreach)
        System.out.println("Percorrendo com for-each:");
        for (int num : numeros) {
            System.out.println(num);
        }

        // 6. Ordenando o Vetor
        Arrays.sort(numeros);
        System.out.println("Vetor ordenado: " + Arrays.toString(numeros));

        // 7. Buscando um Elemento
        int indice = Arrays.binarySearch(numeros, 30);
        System.out.println("Número 30 encontrado no índice: " + indice);
    }
}
