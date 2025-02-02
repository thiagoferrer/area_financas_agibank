/*Soma dos múltiplos (while)
Peça dois números ao usuário: um limite e um multiplicador. Some todos os números múltiplos do multiplicador até o limite.
Exemplo:
Entrada: Limite: 15, Multiplicador: 3
Saída: 3 + 6 + 9 + 12 + 15 = 45*/
package pessoal_exercicios;

import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar um número ao usuário
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        scanner.close();

        //Verificar se o número é primo
        if(ehprimo(num)){
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }

    public static boolean ehprimo(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){ //Verificar divisibilidade até a raiz quadrada de num
            if(num % i == 0){
                return false;//Se for divisível por algum número além de 1 a ele mesmo, não é primo
            }
        }
        return true; //Se não encontrou divisores, é primo
    }
}

/*Explicação:
1 - Recebe um número do usuário usando Scanner.
2 - Verifica se é primo na função ehPrimo(int num):
3 - Se for menor que 2, retorna false.
4 - Testa divisibilidade apenas até a raiz quadrada de num (otimização).
5 - Se encontrar algum divisor além de 1 e ele mesmo, retorna false.
6 - Exibe a saída correspondente.*/

