//Faça um programa que calcule o fatorial de qualquer número digitado pelo usuário, sabendo que
// o fatorial de um número é o produtório dos números inteiros e ele mesmo.
package s2exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int num =  scanner.nextInt();
        scanner.close();

        if(num < 0){
            System.out.print("Fatorial não existe para números negativos.");
            return;
        }

        long fatorial = 1;
        for (int i = 1; i <= num; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}
