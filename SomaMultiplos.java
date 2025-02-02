/*Soma dos múltiplos (while)
Peça dois números ao usuário: um limite e um multiplicador. Some todos os números múltiplos do multiplicador até o limite.
Exemplo:
Entrada: Limite: 15, Multiplicador: 3
Saída: 3 + 6 + 9 + 12 + 15 = 45*/
package pessoal_exercicios;

import java.util.Scanner;

public class SomaMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar o limite e o o multiplicador ao usuário
        System.out.print("Digite o limite: ");
        int limite = scanner.nextInt();

        System.out.print("Digite o multiplicador: ");
        int multiplicador = scanner.nextInt();

        int soma = 0;
        int num = multiplicador;

        //Soma os múltiplos do multiplicador até o limite
        System.out.print("Soma: ");
        while(num <= limite) {
            System.out.print(num);
            soma = soma + num;
            num = num + multiplicador;

            if (num <= limite){
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + soma);

        //Fechar o scanner
        scanner.close();
    }

}

/*Explicação:
1 - Solicita os valores do usuário:
2 - limite: até onde a soma será feita.
3 - multiplicador: os números que serão somados.
4 - Usa um while para somar os múltiplos:
5 - Começa do multiplicador.
6 - Soma e imprime os múltiplos até alcançar o limite.
7 - Usa if (num ≤ limite) para evitar um "+" extra na impressão.*/

