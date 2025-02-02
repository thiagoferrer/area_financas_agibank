/*Adivinhe o número (do while)
O programa escolhe um número aleatório de 1 a 10, e o usuário deve adivinhar. O programa continua a pedir até que o usuário acerte.
Exemplo:
Entrada: 5, 3, 7 (acertou!)
Saída: "Parabéns, você acertou!"*/

package pessoal_exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Número aleatório de 1 a 10
        int numero = random.nextInt(10) + 1;
        int palpite = 0;

        //Loop do-while para adivinhar o número
        do {
            System.out.print("Adivinhe o número (1 a 10): ");
            palpite = scanner.nextInt();

            if (palpite != numero) {
                System.out.println("Tente novamente!");
            }
        } while (palpite != numero);

        System.out.println("Parabéns, você acertou!");

        //Fechar o scanner
        scanner.close();
    }
}

/*Explicação
1 - Random random = new Random(); → Cria um objeto para gerar números aleatórios.
2 - random.nextInt(10) + 1; → Gera um número de 1 a 10.
3 - O do while garante que o programa execute pelo menos uma vez e continue até o usuário acertar.
4 - Compara tentativa != numeroAleatorio → Se errar, pede novo palpite.
5 - Se acertar, exibe "Parabéns, você acertou!".*/
