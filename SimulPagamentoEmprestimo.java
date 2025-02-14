/*Ex03 -Simulação de pagamento de emprestimo: Dado um valor de emprestimo e uma quantidade de parcelas, programa
deve calcular o valor de cada parcela e armazenar os resultados em um vetor.
fórmula (parcela fixa sem juros): parcela=valortotal/numeros de parcelas
Exemplo de entrada: valor do empréstimo 1000.0 4
Saída esperada: valores das parcelas
250.00 250.00 250.00 250.00*/
package s4exercicios.Ex18;

public class SimulPagamentoEmprestimo {
    public static void main(String[] args) {

        double valorEmprestimo = 1000.0;
        int numeroParcelas = 4;
        double[] parcelas = calcularParcelas(valorEmprestimo, numeroParcelas);
        System.out.println("Valores das parcelas:");
        for (double parcela : parcelas) {
            System.out.printf("%.2f ", parcela);
        }
    }

    public static double[] calcularParcelas(double valorEmprestimo, int numeroParcelas) {
        double[] parcelas = new double[numeroParcelas];
        double valorParcela = valorEmprestimo / numeroParcelas;

        for (int i = 0; i < numeroParcelas; i++) {
            parcelas[i] = valorParcela;
        }
        return parcelas;
    }
}

