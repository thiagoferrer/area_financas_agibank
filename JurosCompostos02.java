/*previsão de juros composto
crie um programa que armazena em um vetor os valores futuros de um investimento de R$1.000,00 aplicados em uns juros compostos por 6 meses, com taxa de 2% ao mês. a fórmula utilizada é:
valor futuro = valor inicial *(1+taxa)^n
onde  n é o número de meses .
saída esperada:
valores futuros: {1020.00, 1040.40, 1061.21, 1082.43, 1104.08, 1126.16}
sem o codigo. somente a sintaxe bem detalhada e explicada*/
package s3exercicios;

public class JurosCompostos02 {
    public static void main(String[] args) {

        //Declaração Variáveis
        double valorInicial = 1000.00; //Capital Inicial (p)
        double taxaJuros = 0.02;       //Taxa de Juros Mensal 2% (r)
        int numeroMeses = 6;        //Número de meses (n)

        //Armazenar os valores
        double[]  valoresFuturos = new double[numeroMeses];

        //Loop - calcular
        for (int i = 0; i < numeroMeses; i++){
            valoresFuturos[i] = valorInicial * Math.pow(1 + taxaJuros, i + 1);

            //Arredondamento
            valoresFuturos[i] =Math.round(valoresFuturos[i] * 100) / 100.0;

        }

        //Exibição
        System.out.println("Valores Futuros: ");
        for (int i =0; i < valoresFuturos.length; i++){
            System.out.println(valoresFuturos[i]);
        }
    }
}
