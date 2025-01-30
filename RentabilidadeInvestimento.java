//Código Java para calcular a rentabilidade de um investimento:
package pessoal_exercicios;

import java.util.Scanner;

public class RentabilidadeInvestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital investido (R$): ");
        double capital = scanner.nextDouble();

        System.out.print("Digite o montante final obtido (R$): ");
        double montante = scanner.nextDouble();

        double rentabilidade = ((montante - capital) / capital) * 100;

        System.out.printf("A rentabilidade do investimento foi de: %.2f%% %n", rentabilidade);

        scanner.close();
    }

}
