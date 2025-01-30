//Numa loja, todos os clientes que comprarem mais de R$300,00 receberão um desconto proporcional ao valor da sua compra, conforme a tabela abaixo:
//Valor da compra(R$): Até 500,00; De 501,00 a 1000,00; acima de 1000,00.
//Desconto (%): 5;10;12
//Você foi incumbido de fazer um programa que permita que o cliente entre com o valor de cada produto comprado pelo cliente.
//Mostre o total da compra, o valor do desconto e o preço a pagar para cada cliente. Pergunte ao usuário se deseja terminar a digitação dos produtos.
//Também é necessário verificar se existe mais cliente para serem atendidos.
package s2exercicios;

import java.util.Scanner;

public class LojaDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String novoCliente;

        do {
            double totalCompra = 0;
            String continuar;

            //Entrada dos produtos
            System.out.println("\nNovo Cliente. ");
            do{
                System.out.print("Digite o valor do produto (ou 0 para finalizar a compra): R$ ");
                double valorProduto = scanner.nextDouble();

                if (valorProduto == 0) {
                    break; // Finaliza a inserção de produtos
                }

                totalCompra += valorProduto;

                System.out.print("Deseja adicionar mais produtos? (S/N): ");
                continuar = scanner.next();
            }while (continuar.equalsIgnoreCase("S"));

            //Cálculo do desconto
            double desconto = 0;

            if (totalCompra > 300){
                if(totalCompra <= 500){
                    desconto = totalCompra * 0.05;
                } else if (totalCompra <= 1000){
                    desconto = totalCompra * 0.10;
                } else {
                    desconto = totalCompra * 0.12;
                }
            }
            double valorFinal = totalCompra - desconto;

            //Exibir resultados
            System.out.println("\nResumo da compra: ");
            System.out.printf("Total da compra: R$ %.2f%n", totalCompra);
            System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);
            System.out.printf("Total a pagar: R$ %.2f%n", valorFinal);

            //Pergunta se há mais clientes para serem atendidos
            System.out.print("\nHá mais clientes para serem atendidos? (S/N): ");
            novoCliente = scanner.next();
        }while (novoCliente.equalsIgnoreCase("S"));

        System.out.print("Encerrando o sistema. Obrigado pela preferência!");

        scanner.close();
    }
}
