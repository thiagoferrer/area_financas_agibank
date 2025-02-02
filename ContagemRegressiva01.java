/*Contagem regressiva (for)
Escreva um programa que peça um número inteiro positivo ao usuário e exiba uma contagem regressiva até 0.
Exemplo:
Entrada: 5
Saída: 5, 4, 3, 2, 1, 0*/
package pessoal_exercicios;

import java.util.Scanner;

public class ContagemRegressiva01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita um número inteiro ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        //Contagem regressiva usando (for)
        for (int i = num; i>=0; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(",");
            }
        }
        //Fechar o scanner
        scanner.close();
    }
}
/*Explicação:
1- Scanner scanner = new Scanner(System.in); → Lê a entrada do usuário.
2- for (int i = num; i >= 0; i--) → Inicia de num, decrementa até 0.
3- System.out.print(i); → Exibe o número na mesma linha.
4- if (i > 0) System.out.print(", "); → Adiciona vírgula apenas entre os números.
5- scanner.close(); → Fecha o scanner para evitar vazamento de recursos.*/