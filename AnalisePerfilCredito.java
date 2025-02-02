/*Análise de Perfil de Crédito
Leia o salário e as despesas mensais de uma pessoa. Calcule a margem de crédito (salário - despesas)
disponível e exiba se é seguro conceder um empréstimo.*/
package pessoal_exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AnalisePerfilCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita o salário e as despesas ao usuário
        System.out.print("Digite o salário mensal:");
        double salario = scanner.nextDouble();

        System.out.print("Digite o total de despesas mensais: ");
        double despesas = scanner.nextDouble();

        //Calcula a margem de crédito disponível
        double margemCredito = salario - despesas;

        //Define se é seguro conceder um empréstimo
        if (margemCredito >= (salario * 0.3)){
            System.out.printf("Empréstimo concedido! Margem de crédito disponível: R$ %.2f%n", margemCredito);
            System.out.println("Empréstimo pode ser concedido com segurança.");
    } else {
            System.out.printf("Empréstimo negado! Margem de crédito disponível: R$ %.2f%n", margemCredito);
            System.out.println("Alerta! O comprometimento da renda é alto. Empréstimo pode não ser seguro.");
        }
        scanner.close();
    }
}
