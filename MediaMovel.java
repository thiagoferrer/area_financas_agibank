/*Ex02 - Cálculo de Média Móvel de Ativos: Receba os preços de uma ação nos últimos 10 dias e calcule a média móvel de 3 dias.
 *
 * - Se houve menos de 3 valores no vetor, lance uma exceção IllegalArgumentException.
 * - Capture e trate NumberFormatException caso os preços sejam informados de forma incorreta
 * Fórmula da Média Móvel: MM=Patual+Panterior1+Panterior2/3
 *
 * Exemplo de Entrada:
 *
 * Preços das ações: [100.0, 102.0, 101.0, 103.0, 105.0]
 *
 * Saída Esperada:
 * Média Móvel (dia 3): 101.0
 * Média Móvel (dia 4): 102.0
 * Média Móvel (dia 5): 103.0*/
package s4exercicios.Ex12;

public class MediaMovel {
    public static void main(String[] args) {

        double[] precosAcoes = {100, 102, 101, 103, 105};

        if (precosAcoes.length < 3) {
            throw new IllegalArgumentException();
        }
        System.out.println("\nCálculo de Média Móvel de 3 dias:");

        for (int i = 2; i < precosAcoes.length; i++) {
            try {
                double mediaMovel = (precosAcoes[i] + precosAcoes[i - 1] + precosAcoes[i - 2]) / 3;
                System.out.printf("Média Móvel (dia %d): %.2f%n", i + 1, mediaMovel);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao interpretar o preço da ação: " + e.getMessage());
            }
        }
    }
}
