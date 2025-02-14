/*Ex08- Simulador de parcelamento de Empréstimo: crie um método para calcular as parcelas de um empréstimo, considerando um número fixo de 12 meses e
 * taxa de juros mensal.
 *  - Se a entrada da taxa de juros for negativa, dispare IllegalArgumentException
 *  - Se o valor do empréstimo for 0, lance ArithmeticException para evitar divisão por zero
 *
 * Fórmula da Parcela Mensal: PMT=(Pxr)/1-(1+r)−n
 *
 * Onde:
 * - P = Valor de empréstimo
 * - r = Taxa de juros mensal
 * - n = Número de meses
 *
 * Exemplo de Entrada
 * Valor de empréstimo: 10.000
 * Taxa de juros mensal: -0.02
 *
 * Saída Esperada:
 * Erro: A taxa de juros não pode ser negativa!*/
package s4exercicios.Ex23;

public class SimulacaoParcEmprest {
    public static void main(String[] args) {
        int parcelas = 12;
        double[][] precosSimulados = new double[parcelas][4];
        try {
            precosSimulados = simularEmprestimoPrice(1000, 5, 12);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        for (double[] precosSimulado : precosSimulados) {
            for (double v : precosSimulado) {
                System.out.println("%.2f ");
            }
            System.out.println();
        }
    }

    public static double[][] simularEmprestimoPrice(double valorEmprestimo, double taxaMensal, int parcelas) {
        if (valorEmprestimo < 0 || taxaMensal < 0 || parcelas < 0) {
            throw new IllegalArgumentException("Argumentos não válidos!");
        }
        double[][] matrizPrice = new double[parcelas + 1][5];
        double taxa = taxaMensal / 100;
        double saldoDevedorAntes;
        double saldoDevedorDepois = valorEmprestimo;
        double juros = 0;
        double PMT = 0;
        for (int i = 0; i < matrizPrice.length; i++) {
            saldoDevedorAntes = saldoDevedorDepois;
            saldoDevedorDepois = saldoDevedorDepois - (PMT - juros);
            matrizPrice[i] = new double[]{i, saldoDevedorAntes, juros, PMT - juros, saldoDevedorDepois};
            PMT = (valorEmprestimo * taxa) / (1 - Math.pow(1 + taxa, -parcelas));
            juros = saldoDevedorDepois * taxa;
        }
        System.out.println(PMT);
        return matrizPrice;
    }
}
