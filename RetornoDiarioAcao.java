/*Ex01 - */
package s4exercicios.Ex16;

public class RetornoDiarioAcao {
    public static void main(String[] args) {

        double[] precosAcoes = new double[]{100.0, 102.0, 101.0, 103.0, 105.0};
        double[] variacoesDiarias = new double[precosAcoes.length - 1] ;

        for (int i = 0; i < precosAcoes.length - 1; i++) {
            variacoesDiarias[i] = ((precosAcoes[i + 1] - precosAcoes[i]) / precosAcoes[i]) * 100;
        }

        for (int i = 0; i < variacoesDiarias.length; i++) {
            System.out.printf("%.2f %%\n", variacoesDiarias[i]);
        }
    }
}

