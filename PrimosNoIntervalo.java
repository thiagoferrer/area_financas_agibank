/*Números primos em um intervalo (for e if)
Peça dois números X e Y e exiba todos os números primos no intervalo [X, Y].
Exemplo:
Entrada: X = 10, Y = 30
Saída: 11, 13, 17, 19, 23, 29*/
package pessoal_exercicios;

import java.util.Scanner;

public class PrimosNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar os valores X e Y ao usuário
        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        scanner.close();

        //Garante que x seja menor ou igual a Y
        if (x > y){
            int temp = x;
            x = y;
            y = temp;
        }

        System.out.print("Números primos no intervalo[" + x + ", " + y + "]: ");

        boolean primeiro = true;
        for(int i = x; i <= y; i++){
            if(ehprimo(i)){
                if(primeiro){
                    System.out.print(i);
                    primeiro = false;
                } else {
                    System.out.print(", " + i);
                }
            }
        }
    }

    //Função para verificar se um número é primo
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
1 - Solicita os valores X e Y ao usuário.
2 - Garante que X seja menor que Y trocando os valores caso X > Y.
3 - Percorre o intervalo [X, Y] com for e verifica se cada número é primo.
4 - Imprime os números primos corretamente, separando-os por vírgulas.
5 - A função ehPrimo(int num) verifica se um número é primo de forma eficiente (até a raiz quadrada).*/

