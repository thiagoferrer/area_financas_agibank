package s3exerciciosVetores;

public class MaiorDrawdow {
    public static void main(String[] args) {

        double [] precos = {100.0, 105.0, 102.0, 110.0, 108.0, 107.0, 95.0, 97.0, 99.0, 103.0};

        double picoMaximo = Double.MIN_VALUE;
        double maiorDrawdown = 0.0;

        for (int i = 0; i < precos.length; i++){
            double precoAtual = precos[i];

            //pico máximo
            if (precoAtual > picoMaximo){
                picoMaximo = precoAtual;
            }

            //Calcular o drawdown atual se o preço for menor que o pico máximo
            double drawdownAtual = ((precoAtual - picoMaximo) / picoMaximo) * 100;

            //Atualizar o maior drawdown se o drawdown atual for menor
            if (drawdownAtual < maiorDrawdown) {
                maiorDrawdown = drawdownAtual;
            }
        }
        System.out.printf("Maior drawdown: %.2f%%%n", maiorDrawdown);
    }
}
