/*Ex06 - Cálculo do retorno Médio de um investimento: Um investidor aplica dinheiro em uma ação por N dias.
Ele deseja calcular o retorno médio diário, definido como:

 * RetornoMedio = (1 / N-1) Σ(((Pi+1 -Pi)/Pi) * 100)

 * Exemplo de entrada: quantidade de dias e preços da ação em cada dia 5

 * 100.0 102.0 101.0 103.0 105.0
 *
 * Saída Esperada: retorno médio diário
 * 1.98*/
package s4exercicios.Ex21;

import static javax.swing.text.html.HTML.Attribute.N;

public class CalculoRetornoMedioInvest {
    public static void main(String[] args) {

        int nDias = 5;
        double[] precosAcao = {100.0, 102.0, 101.0, 103.0, 105.0};

        double retornoMedio = calcularRetornoMedio(nDias, precosAcao);
        System.out.printf("Retorno médio diário: %.2f%%\n", retornoMedio);
    }

    public static double calcularRetornoMedio(int nDias, double[] precosAcao) {
        if (nDias <= 1) {
            return 0.0;
        }

        double somaRetornos = 0.0;

        for (int i = 0; i < nDias - 1; i++) {
            double retornoDiario = ((precosAcao[i + 1] - precosAcao[i]) / precosAcao[i]) * 100;
            somaRetornos += retornoDiario;
        }
        return somaRetornos / (nDias - 1);
    }
}
