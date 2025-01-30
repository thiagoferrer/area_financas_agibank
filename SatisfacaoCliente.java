//Um banco precisa de uma ferramenta para saber o nível de satisfação de atendimento do cliente (de zero a 5).
//Desenvolva uma solução computacional para resolver esta necessidade.
//Mostre mensagens coerentes com as avaliações.

package s2exercicios;

import java.util.Scanner;

public class SatisfacaoCliente {
    public static void main(String[] args) {
        //Criar um scanner para entrada do usuário:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Avalie o atendimento do banco de 0 a 5: ");
        System.out.println("Digite sua nota: ");

        int nota = scanner.nextInt();

        switch (nota){
            case 1:
                System.out.println("Muito Insatisfeito! Pedimos desculpas pelo ocorrido e queremos melhorar.");
            break;
            case 2:
                System.out.println("Insatisfeito! Vamos trabalhar para melhorar sua experiência.");
            break;
            case 3:
                System.out.println("Pouco satisfeito! Agradecemos o feedback e buscaremos melhorias.");
            break;
            case 4:
                System.out.println("Satisfeito! Ficamos felizes com sua experiência positiva.");
            break;
            case 5:
                System.out.println("Muito satisfeito! Agradecemos sua confiança em nosso atendimento.");
            break;
            default:
                System.out.println("Nota inválida! Por favor, insira um número de 0 a 5.");
        }
        //Fechar scanner
        scanner. close();
    }
}
