//Um cliente deseja escolher o tipo de investimento a ser feito: CDB, CDI, Tesourou Direto, FII.
// Faça um programa em java que permite ao usuário fazer esta escolha.
// Dê mensagem conforme o investimento escolhido.

package s2exercicios;

import java.util.Scanner;

public class TipoDeInvestimento {
    public static void main(String[] args) {
        //Criar um scanner para entrada do usúario:
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de investimento: ");
        System.out.println("1 - CDB");
        System.out.println("2 - CDI");
        System.out.println("3 - Tesouro Direto");
        System.out.println("4 - FII");
        System.out.println("Digite o número correspondente: ");

        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Você escolheu CDB! Uma opção segura de renda fixa.");
            break;
            case 2:
                System.out.println("Você escolheu CDI! Uma boa alternativa para liquidez diária.");
            break;
            case 3:
                System.out.println("Você escolheu Tesouro Direto! Ideal para quem busca segurança e rentabilidade.");
            break;
            case 4:
                System.out.println("Você escolheu FII! Uma excelente opção para investimento em imóveis.");
            break;
            default:
                System.out.println("Opção inválida! Escolha um número de 1 a 4.");
        }
        //Fechar o scanner
        scanner.close();
    }
}
