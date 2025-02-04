/*Soma e Média dos Elementos
Leia 10 números inteiros, armazene-os em um vetor e calcule a soma e a média dos valores.
Além disso, mostre quais números são maiores que a média.*/
package pessoal_exercicios;

import java.util.Scanner;

public class SomaMediaVetor {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner (System.in);

        int[] numeros = new int[10];
        int soma = 0;

        //Cálculo da soma
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scanner.nextInt();
            soma = soma + numeros[i];
        }

        //Cálculo da média
        double media = soma / 10.0;

        //Exibir soma e média
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);

        //Exibir números maiores que a média
        System.out.println("Números maiores que a média: ");
        for (int num : numeros){
            if (num > media){
                System.out.println(num + "");
            }
        }
        scanner.close();
    }
}
