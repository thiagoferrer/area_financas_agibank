//Crie um programa que verifique se o número digitado pelo usuário é par ou ímpar:
package s2exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        //Criar um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicitar que o usúario insira um número
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        //Verificar se o número é par ou ímpar
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar");
        }

        //Fechar o scanner
        scanner.close();
    }
}
