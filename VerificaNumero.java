//Crie um programa que verifique se o número digitado pelo usuário é positivo, negativo ou zero:
package s2exercicios;

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        //Criar um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicitar que o usuário insira um número
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();

        //Verificar se o número é positivo, negativo ou zero
        if (numero > 0 ){
            System.out.println("O número é positivo!");
        } else if (numero < 0 ) {
            System.out.println("O número é negativo!");
        } else {
            System.out.println("O número é zero.");
        }

        //Fechar o scanner
        scanner.close();
    }
}
