//A sequência de fibonacci segue a seguinte ordem: 0,1,1,2,3,5,8,13,21,34,55,89,...
// Repare que cada termo é a somatória dos dois anteriores, sendo que os dois primeiros são 0 e 1.
// Faça um programa que receba um valor do usuário e imprima os termos da sequência de fibonacci menores que o valor digitado.
package s2exercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Digite um número limite para a sequência de fibonacci: ");
        int limite = scanner.nextInt();
        scanner.close();

        if (limite < 0) {
            System.out.println("Por favor, digite um número positivo. ");
            return;
        }

        int primeiro = 0, segundo = 1;

        System.out.print("A sequência de fibonacci: " + primeiro);

        while (segundo < limite){
            System.out.print(", " + segundo);
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
