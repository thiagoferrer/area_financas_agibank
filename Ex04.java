/*Ex04 - Implemente um método chamado calcularMediaMovel() que recebe um array de preços de uma ação e um intervalo de tempo n
 * O método deve calcular a média móvel para o intervalo dado.
 *
 * Entrada:
 * Preços: {100.0, 102.0, 101.0, 103.0, 105.0}
 * Intervalo: 3
 *
 * Saída:
 * Média móvel: 101.0, 102.0, 103.0*/

package s4exercicios.Ex04;

public class Ex04 {
    public static double[] calcularMediaMovel(double[] precos, int intervalo) {
        int quantidadeMedias = precos.length - intervalo + 1;
        double[] medias = new double[quantidadeMedias];

        for (int i = 0; i < quantidadeMedias; i++) {
            double soma = 0;
            for (int j = 0; j < intervalo; j++) {
                soma = soma + precos[i + j];
            }
            medias[i] = soma / intervalo;
        }
        return medias;
    }

    public static void main(String[] args) {
        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0};
        int intervalo = 3;

        double[] resultado = calcularMediaMovel(precos, intervalo);

        System.out.print("\nMédia móvel: ");
        for (double media : resultado) {
            System.out.print(media + " ");
        }
    }
}
