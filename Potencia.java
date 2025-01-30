//Calcule a expressão, sem utilizar a função pow() da math: X^Y. Onde X e Y são digitados pelo usuário:
package s2exercicios;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        //Criar scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Solicitar ao usuário para digitar os valores de X e Y.
        System.out.println("Digite o valor de X (base): ");
        int x = scanner.nextInt();

        System.out.println("Digite o valor de Y (expoente): ");
        int y = scanner.nextInt();

        //Cacular a potência manualmente
        long resultado = 1;

        //Se o expoente for negativo, calcular o inverso
        boolean negativo = y < 0;
        if(negativo) {
            y = -y; //Trabalhar com o expoente positivo
        }

        for (int i = 0; i < y; i++){
            resultado *= x;
        }

        //Se o expoente era negativo, calcular o inverso
        if (negativo){
            System.out.println("O resultado é: 1/" + resultado + " ou aproximadamente " + (1.0 / resultado));
        } else {
            System.out.println("O resultado é " + resultado);
        }

        //Fechar o scanner
        scanner.close();
    }
}
