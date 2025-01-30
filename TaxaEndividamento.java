//Código Java para calcular a Taxa de Endividamento:
package pessoal_exercicios;

import java.util.Scanner;

public class TaxaEndividamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite sua renda líquida mensal (R$): ");
        double rendaLiquida = scanner.nextDouble();

        System.out.print("Digite o total de suas dívidas mensais (R$): ");
        double dividas = scanner.nextDouble();

        //Cálculo da taxa de endividamento
        double taxaEndividamento = (dividas / rendaLiquida) * 100;

        //Saída de resultados
        System.out.printf("Sua taxa de endividamento é: %.2f%% %n", taxaEndividamento);

        //Análise da situação financeira
        if (taxaEndividamento < 30){
            System.out.println("Situação saudável: Endividamento controlado.");
        } else if (taxaEndividamento <= 50){
            System.out.println("Alerta: Atenção ao nível de endividamento.");
        } else {
            System.out.println("Crítico: Endividamento elevado! Considere rever suas finanças.");
        }

        scanner.close();
    }
}
