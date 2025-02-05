/*previsão de juros composto
crie um programa que armazena em um vetor os valores futuros de um investimento de R$1.000,00 aplicados em uns juros compostos por 6 meses, com taxa de 2% ao mês. a fórmula utilizada é:
valor futuro = valor inicial *(1+taxa)^n
onde  n é o número de meses .
saída esperada:
valores futuros: {1020.00, 1040.40, 1061.21, 1082.43, 1104.08, 1126.16}
sem o codigo. somente a sintaxe bem detalhada e explicada*/
package s3exerciciosVetores;

import java.util.ArrayList;
import java.util.List;

public class JurosCompostos02 {
    public static void main(String[] args) {

        double valorInicial = 1000.00; //Capital Inicial (p)
        double taxaJuros = 0.02;//Juros Mensal 2% (r)
        double numeroMeses = 6;//Número de meses (n)

        List<Double> valoresFuturos = new ArrayList<>();

        for (int mes = 1; mes <= numeroMeses; mes++){
            double valorFuturo = valorInicial * Math.pow(1 + taxaJuros, mes);

            valorFuturo = Math.round(valorFuturo * 100.0) / 100.0;

            valoresFuturos.add(valorFuturo);
        }
        System.out.println("Valores Futuros: ");
        for (double valor : valoresFuturos){
            System.out.println(valor);
        }
    }
}
