//Implementar um programa que imprima a tabuada de um número digitado pelo usuário.
package s2exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        //Criar um scanner para ler a entrada do usuário:
        Scanner scanner = new Scanner(System.in);

        //Solicitar ao usuário para digitar um número:
        System.out.println(" Digite um número para sua tabuada: ");
        int numero = scanner.nextInt();

        //Imprimir a tabuada do número:
        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechar o scanner
        scanner.close();
    }
}
