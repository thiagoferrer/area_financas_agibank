//Código Java para verificar a capacidade de poupança:
package pessoal_exercicios;

import java.util.Scanner;

public class CapacidadePoupanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua renda líquida mensal (R$): ");
        double rendaLiquida = scanner.nextDouble();

        System.out.print("Digite suas despesas mensais totais (R$): ");
        double despesas = scanner.nextDouble();

        double capacidadePoupanca = rendaLiquida - despesas;
        double percentualPoupanca = (capacidadePoupanca / rendaLiquida) * 100;

        System.out.printf("Sua capacidade de poupança mensal é de: R$ %.2f%n", capacidadePoupanca);
        System.out.printf("Percentual de poupança sobre a renda: %.2f%% %n", percentualPoupanca);

        if (capacidadePoupanca > 0){
            System.out.println("Ótimo! Você está conseguindo economizar.");
        } else if (capacidadePoupanca == 0){
            System.out.println("Cuidado! Você está gastando tudo o que ganha.");
        } else {
            System.out.println("Atenção! Suas despesas são maiores que sua renda.");
        }

        scanner.close();
    }
}
