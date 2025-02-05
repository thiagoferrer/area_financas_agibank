//Verificação de Crédito
//Leia o salário de uma pessoa e o valor de um empréstimo solicitado.
// Exiba se o crédito pode ser aprovado (empréstimo ≤ 30% do salário).
package s1exercicios;

import java.util.Scanner;

public class VerificacaoCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor do empréstimo solicitado: ");
        double emprestimo = scanner.nextDouble();

        double limiteCredito = salario * 0.03;

        if (emprestimo <= limiteCredito){
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado! Valor solicitado excede 30% do salário.");
        }

        scanner.close();
    }
}
