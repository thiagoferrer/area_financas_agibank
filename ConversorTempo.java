/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
Entrada
O arquivo de entrada contém um valor inteiro N.
Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada      Exemplo de Saída
556                     0:9:16
1                       0:0:1
140153                  38:55:53*/
package pessoal_exercicios;

import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lê o valor inteiro (tempo em segundos)
        int segundosTotais = scanner.nextInt();

        //Calcula horas, minutos e segundos
        int horas = segundosTotais / 3600; //1 hora = 3600 segundos
        int minutos = (segundosTotais % 3600) / 60; // O restante dividido por 60 dá os minutos
        int segundos = segundosTotais % 60; //O restante são os segundos

        //Exibe o resultado no formato correto
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);

        scanner.close();
    }
}

/*Explicação do código:
1 - Lê o número inteiro do usuário (segundosTotais).
2 - Calcula as horas dividindo por 3600.
3 - Calcula os minutos pegando o restante (% 3600) e dividindo por 60.
4 - Calcula os segundos pegando o restante (% 60).
5 - Imprime no formato horas:minutos:segundos usando printf().*/


