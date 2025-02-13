/*Ex05 - Comparação de Portifólio de Investimentos: crie uma matriz 3x3, onde cada linha representa um portifólio e
cada coluna representa um ativo financeiro

 - O programa deve calcular a média dos retornos de cada portifólio.
 - Se um valor for inválido(não numérico), capture NumberFormatException.
 - Se um portifólio estiver incompleto, capture ArrayIndexOutOfOfBoundsException.

 Exemplo de Entrada:

 Portifólios:
 {0.05, 0.08, "A"}
 {0.07, 0.06, 0.09}
 {0.02, 0.03, 0.04}

 Saída Esperada:
 Erro: Valor inválido encontrado na célula [0][2]*/
package s4exercicios.Ex15;

public class PortifolioInvestimentos {
    public static void main(String[] args) {

        String[][] portifolio = {
                {"0.05", "0.08", "A"},
                {"0.07", "0.06", "0.09"},
                {"0.02", "0.03", "0.04"}
        };

        int linha = 3;
        int coluna = 3;
    }
}
