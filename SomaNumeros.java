/*Soma dos números (while)
Solicite ao usuário um número inteiro positivo e some todos os números de 1 até ele.
Exemplo:
Entrada: 4
Saída: 1 + 2 + 3 + 4 = 10*/
package pessoal_exercicios;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo:");
        int num = scanner.nextInt();

        int soma = 0;
        int i = 1;

        //‘Loop’ while para somar os números de 1 até num:
        while(i <= num){
            soma += i;
            System.out.print(i);
            if (i < num) {
                System.out.print(" + ");
            }
            i++;
        }
        //Exibe o resultado da soma
        System.out.print(" = " + soma);

        //Fechar o scanner
        scanner.close();
    }
}

/*Explicação:
1 - Scanner scanner = new Scanner(System.in); → Lê a entrada do usuário.
2 - Variáveis soma e i → soma armazena a soma acumulada, i é o contador.
3 - while (i ≤ num) → Continua a somar enquanto i for menor ou igual a num.
4 - soma += i; → Adiciona i à soma total.
5 - Imprime i e adiciona " + " → Para formatar a saída corretamente.
6 - Ao final, imprime o resultado com " = ".
7 - scanner.close(); → Fecha o scanner para evitar vazamento de recursos.*/

