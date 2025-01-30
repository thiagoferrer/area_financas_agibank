//Calcular juros simples de um investimento:
package pessoal_exercicios;

import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial (R$): ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (% ao mês): ");
        double taxa = scanner.nextDouble() / 100; //Convertendo para decimal

        System.out.print("Digite o tempo (meses): ");
        int tempo = scanner.nextInt();

        //Cálculo de juros simples
        double juros = capital * taxa * tempo;
        double montante = capital + juros;

        //Saída de resultados
        System.out.printf("Juros: R$ %.2f%n", juros);
        System.out.printf("Montante final: R$ %.2f%n", montante);

        scanner.close();
    }
}
