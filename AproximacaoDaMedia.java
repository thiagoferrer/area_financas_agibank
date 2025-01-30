//Crie um programa que verifique o quanto um valor se aproxima da média, em percentual.
//Entre com o valor e a média.
package s2exercicios;

import java.util.Scanner;

public class AproximacaoDaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar o valor e a média:
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a média: ");
        double media = scanner.nextDouble();

        //Calcular a diferença entre o valor e a média:
        double diferenca = Math.abs(valor - media);

        //Calcular o percentual de aproximação
        double percentual = (diferenca / media) * 100;

        //Exibir o resultado
        System.out.printf("O valor está %.2f%% distante da média. %n", percentual);

        //Fechar o scanner
        scanner.close();
    }
}
