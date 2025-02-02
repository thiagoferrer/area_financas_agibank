/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.
Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
Obs: Utilize ponto (.) para separar a parte decimal.

Exemplo de Entrada
576.73

Exemplo de Saída
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01*/
package pessoal_exercicios;

import java.util.Scanner;


public class TrocoNotasMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor monetário
        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100); // Converte para centavos para evitar problemas com ponto flutuante

        // Definição das notas e moedas em centavos
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidade = centavos / nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, nota / 100.0);
            centavos %= nota; // Atualiza o valor restante
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidade = centavos / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
            centavos %= moeda; // Atualiza o valor restante
        }

        scanner.close();
    }
}


/*Explicação do código:
1 - Entrada: Lê um número decimal (double) do usuário.
2 - Conversão para centavos: multiplica por 100 e arredonda para evitar problemas de precisão com ponto flutuante.
Processamento:
3 - Armazena valores das notas e moedas em centavos (int).
4 - Usa um for para calcular quantas notas e moedas são necessárias.
5 - Atualiza o valor restante (centavos %= nota ou centavos %= moeda).
6 - Saída: Imprime a quantidade de cada cédula e moeda de forma formatada.*/
