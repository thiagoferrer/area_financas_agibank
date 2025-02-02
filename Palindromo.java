/*Verificação de palíndromo (for e if)
Peça ao usuário uma palavra e verifique se ela é um palíndromo (lida de trás para frente é igual).
Exemplo:
Entrada: "radar"
Saída: "É um palíndromo!"
Entrada: "casa"
Saída: "Não é um palíndromo!"*/
package pessoal_exercicios;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar a palavra do usuário
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine().trim().toLowerCase();

        String inversa = "";

        //criando a versão invertida da palavra
        for (int i = palavra.length() - 1; i >=0; i--) {
            inversa = inversa + palavra.charAt(i);
        }

        //Verificando se a palavra é um palíndromo
        if (palavra.equals(inversa)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo!");
        }

        scanner.close();
    }
}

/*Explicação:
1 - Entrada do usuário: Usa Scanner para ler a palavra.
2 - Normalização: Remove espaços extras e converte para minúsculas (trim() e toLowerCase()).
3 - Inversão da palavra: usa um 'for' para percorrer de trás para frente e construir a inversa.
4 - Comparação: Se palavra 'for' igual à inversa, imprime "É um palíndromo!", senão, "Não é um palíndromo!".*/

