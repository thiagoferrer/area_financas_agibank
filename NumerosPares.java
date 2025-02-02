/*Números pares de 1 a 20 (for)
Use um for para exibir todos os números pares de 1 a 20.
Saída: 2, 4, 6, 8, ..., 20*/
package pessoal_exercicios;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //loop for para exibir números pares de 1 a 20
        for (int i = 2; i <= 20; i += 2){
            System.out.println(i);
            if (i < 20){
                System.out.print(",");
            }
        }
    }
}

/*Explicação:
1 - O ‘loop’ for começa em 2 e incrementa de 2 em 2, garantindo apenas números pares.
2 - O System.out.print(i) imprime os números na mesma linha.
3 - O if (i < 20) impede que a última vírgula seja exibida após o número 20.*/

