//Crie um programa em Java que mostre a situação de um atleta de acordo com seu IMC
package s2exercicios;

import java.util.Scanner;

public class SituacaoAtleta {
    public static void main(String[] args) {
        //Criar um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicitar peso e altura do atleta
        System.out.print("Digite o peso do atleta (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura do atleta (em metros): ");
        double altura = scanner.nextDouble();

        //Cacular o IMC
        double imc = peso / (altura * altura);

        //Determinar a situação do atleta com base no IMC
        System.out.printf("IMC do atleta: %.2f%n", imc);
        if (imc < 18.5){
            System.out.println("Situação: Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9){
            System.out.println("Situação: Sobrepeso.");
        }else if (imc >= 25.0 && imc < 34.9){
            System.out.println("Situação: Obesidade Grau I.");
        } else if (imc >= 35.0 && imc <39.9){
            System.out.println("Situação: Obesidade Grau II (Severa).");
        } else {
            System.out.println("Situação: Obesidade Grau III (Mórbida).");
        }
        //Fechar o scanner
        scanner.close();
    }
}
