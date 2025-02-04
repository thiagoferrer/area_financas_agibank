/*Interseção de Vetores
Leia dois vetores de 5 posições cada, contendo números inteiros.
Em seguida, crie um terceiro vetor contendo apenas os números que aparecem em ambos os vetores iniciais (sem repetições).
*/
package pessoal_exercicios;

import java.util.HashSet;
import java.util.Scanner;

public class IntersecaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        HashSet<Integer> conjunto1 = new HashSet<>();
        HashSet<Integer> intersecao = new HashSet<>();

        // Leitura do primeiro vetor
        System.out.println("Digite 5 números inteiros para o primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = scanner.nextInt();
            conjunto1.add(vetor1[i]);
        }

        // Leitura do segundo vetor
        System.out.println("Digite 5 números inteiros para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
            if (conjunto1.contains(vetor2[i])) {
                intersecao.add(vetor2[i]);
            }
        }

        scanner.close();

        // Exibir os números que aparecem em ambos os vetores
        System.out.println("Números presentes em ambos os vetores (sem repetições):");
        if (intersecao.isEmpty()) {
            System.out.println("Nenhum número em comum encontrado.");
        } else {
            for (int num : intersecao) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
