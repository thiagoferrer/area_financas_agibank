//Faça um programa que calcule e mostre o quadrado de um número N inteiro positivo, digitado pelo usuário.
//O cálculo deve ser feito através da soma dos N primeiros números ímpares.
//Ex: Se N= 3 o programa calculará 1+3+5 = 9, que é o quadrado de 3.

package s2exercicios;

import java.util.Scanner;

public class QuadradoPorSoma {
    public static void main(String[] args) {
        //Criar um scanner para ler a entrada do usuário:
        Scanner scanner = new Scanner(System.in);

        //Solicitar ao usuário para digitar um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

        //Verificar se o número é positivo
        if(N <= 0){
            System.out.println("Por favor, insira um número positivo");
        } else {
        //Variáveis para armazenar o resultado e o número ímpar atual
            int soma = 0;
            int numeroImpar = 1;

        //Somar os N primeiros números ímpares
            for(int i = 1; i <= N; i++){
                soma += numeroImpar;
                numeroImpar += 2; //Próximo número ímpar
            }
        //Exibir o resultado da soma, que é o quadrado de N
            System.out.println("A soma dos " + N + " primeiros números ímpares é: " + soma);
            System.out.println("O quadrado de " + N + " é: " + soma);
        }

        //Fechar o scanner
        scanner.close();
    }
}
