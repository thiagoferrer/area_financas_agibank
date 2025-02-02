/*Contagem regressiva personalizada (for)
Agora, além de exibir a contagem regressiva até 0, peça ao usuário um passo para a contagem.
Exemplo:
Entrada: Número inicial: 20, Passo: 3
Saída: 20, 17, 14, 11, 8, 5, 2, 0 */
package pessoal_exercicios;

import java.util.Scanner;

public class ContagemRegressiva02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar ao usuário o número inicial e o passo
        System.out.println("Digite o número inicial: ");
        int numInicial = scanner.nextInt();

        System.out.println("Digite o passo da contagem: ");
        int passo = scanner.nextInt();

        //Contagem regressiva usando for
        for (int i = numInicial; i >= 0; i -= passo) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        //Fechar o scanner
        scanner.close();
    }
}

/*Explicação:
1 - Recebe dois valores do usuário:
2 - numeroInicial: número de onde a contagem começa.
3 - passo: valor pelo qual a contagem diminui a cada iteração.
4 - ‘Loop’ for realiza a contagem regressiva:
5 - Começa em numeroInicial e decrementa pelo passo.
6 - Para evitar uma vírgula extra no final, a verificação if (i - passo ≥ 0) é usada.*/