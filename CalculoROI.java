//Código Java para calcular o ROI (Return on Investment):
package pessoal_exercicios;

import java.util.Scanner;

public class CalculoROI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo do investimento (R$): ");
        double custoInvestimento = scanner.nextDouble();

        System.out.println("Digite o ganho obtido com o investimento (R$): ");
        double ganhoInvestimento = scanner.nextDouble();

        double roi = ((ganhoInvestimento - custoInvestimento) / custoInvestimento) * 100;

        System.out.printf("O ROI do investimento é: %.2f%% %n", roi);

        if(roi > 0){
            System.out.println("Bom investimento! Houve retorno positivo.");
        } else if (roi == 0){
            System.out.println("O investimento se pagou, mas não gerou lucro.");
        } else {
            System.out.println("Investimento ruim! Houve prejuízo.");
        }
        scanner.close();
    }
}
