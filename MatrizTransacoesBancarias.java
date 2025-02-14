/*Ex04 - Matriz de Transações Bancárias: Um banco acompanha 3 clientes e suas 5 transações mais recentes.
O saldo inicial de cada cliente é de 1000 reais.
Crie uma matriz 3x5 e preencha com os valores das transações.
Depois, para cada cliente, calcule e exiba:

 1. O total movimentado.
 2. O saldo final, considerando que cada cliente começou com 1000.0 na conta.
 Exemplo de Entrada: valores das transações (podem ser positivos ou negativos)
 100 -50 200 -30 50
 -100 -200 50 100 150
 300 -100 -50 -150 200

 Saída Esperada:
 Cliente 1: Total Movimentado = 270.00 | Saldo final = 1270.00
 Cliente 2: total Movimentado = 0.00 | Saldo Final = 1000.00
 Cliente 3: Total Movimentado = 200.00 | Saldo Final = 1200.00*/
package s4exercicios.Ex19;

public class MatrizTransacoesBancarias {
    public static void main(String[] args) {
        double[][] transacoes = {
                {100, -50, 200, -30, 50},
                {-100, -200, 50, 100, 150},
                {300, -100, -50, -150, 200}
        };
        double saldoInicial = 1000.0;

        for (int cliente = 0; cliente < transacoes.length; cliente++) {
            double totalMovimentado = calcularTotalMovimentado(transacoes[cliente]);
            double saldoFinal = saldoInicial + totalMovimentado;
            System.out.printf("Cliente %d: Total Movimentado = %.2f | Saldo Final = %.2f%n",
                    cliente + 1, totalMovimentado, saldoFinal);
        }
    }

    public static double calcularTotalMovimentado(double[] transacoesCliente) {
        double total = 0.0;
        for (double transacao : transacoesCliente) {
            total += transacao;
        }
        return total;
    }
}
