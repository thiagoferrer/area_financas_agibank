//Conversão de Moeda
//Leia o valor em reais e a cotação atual do dólar, convertendo o valor para dólares e exibindo o resultado.
package s1exercicios;

import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar (U$): ");
        double cotacaoDolar = scanner.nextDouble();

        double valorDolares = valorReais / cotacaoDolar;

        System.out.printf("O valor em dólares é: US$ %.2f%n", valorDolares);

        scanner.close();
    }
}
