/*Ex03 - Validação de Planilha de Riscos: Crie um programa para validar uma planilha financeira de riscos representada
por uma matriz 5x5 com valores de riscos entre 0 e 1.
 - Se a matriz estiver incompleta, trate ArrayIndexOutOfBoundsExcepetion.

 Exemplo de Entrada:

 Matriz de Riscos:
 {0.2, 0.5, 1.1, 0.4, 0.3}
 {0.7, 0.9, 0.1, 0.6, 0.8}

 Saída Esperada:
 Erro: Valor inválido encontrado na célula[0][2]; 1.1*/
package s4exercicios.Ex13;

public class PlanilhaRiscos {
    public static void main(String[] args) {

        double[][] matrizRiscos = {
                {0.2, 0.5, 1.1, 0.4, 0.3},
                {0.7, 0.9, 0.1, 0.6, 0.8},
                {}, // Linha incompleta para teste
                {0.4, 0.2, 0.3, 0.1, 0.9},
                {0.6, 0.5, 0.7, 0.8, 0.3}
        };

        int linha = 5;
        int coluna = 5;

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                try {
                    if (matrizRiscos[i][j] < 0 || matrizRiscos[i][j] > 1) {
                        System.out.println("\nErro: Valor inválido encontrado na célula[" + i + "][" + j + "]; " + matrizRiscos[i][j]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Erro: Matriz incompleta na linha[" + i + "] ou coluna[" + j + "]");
                }
            }
        }
    }
}
