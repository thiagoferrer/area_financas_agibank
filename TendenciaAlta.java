/*Ex01 - Crie um programa que recebe um vetor com os preços diários de uma ação ao longo de 10 dias.
O programa deve:
- Identificar se o mercado está em uma tendência de alta (preços aumentam continuamente por pelo menos 3 dias consecutivos.)
- Caso exista uma tendência de alta, exibir os dias que compõem essa tendência (índices do vetor)
- Caso contrário, exibir "Sem tendência de alta identificada."*/
package s3exercicios;

import java.util.Scanner;

public class TendenciaAlta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precos = new double[10];

        // Solicita ao usuário que insira os preços diários
        System.out.println("Digite os preços das ações para 10 dias:");
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();

        // Chama o método para verificar a tendência de alta
        verificarTendenciaAlta(precos);
    }

    public static void verificarTendenciaAlta(double[] precos) {
        int diasDeAlta = 0;
        boolean tendenciaAltaEncontrada = false;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                diasDeAlta++;
                if (diasDeAlta >= 2) { // Se houver pelo menos 3 dias consecutivos de alta
                    if (!tendenciaAltaEncontrada) {
                        System.out.print("Tendência de alta identificada nos dias: ");
                        tendenciaAltaEncontrada = true;
                    }
                    System.out.print((i + 1) + " "); // Exibe o número exato do dia (1-based index)
                }
            } else {
                diasDeAlta = 0; // Reseta o contador se não houver alta
            }
        }

        if (!tendenciaAltaEncontrada) {
            System.out.println("Sem tendência de alta identificada.");
        }
    }
}
