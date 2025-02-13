/*Ex04 - Simulador de parcelamento de Empréstimo: crie um método para calcular as parcelas de um empréstimo, considerando um número fixo de 12 meses e
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
package s4exercicios.Ex14;

public class SimuladorEmprestimo {
    public static void main(String[] args) {
        //Parâmetros
        double valorEmprestimo = 10000.0;
        double txJurosMensal = -0.02;
        int numMeses = 12;

    }
}
