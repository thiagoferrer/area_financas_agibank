/*Ex02 - Implemente um método chamdo calcularJurosSimples() que recebe o capital inicial, a taxa de juros anual(%)
e o tempo (em anos). O método deve retornar o montante final após o período.

Entrada:
Capital: 1000.0, Taxa: 5.0%, Anos: 3

Saída:
Montante final: 1150.0*/
package s4exercicios.Ex02;

import java.text.DecimalFormat;

public class Ex02 {
    public static double calcularJurosSimples(double capital, double taxa, int anos) {
        return capital * (1 + taxa / 100 * 3);
    }

    public static void main(String[] args) {
        double resultado = calcularJurosSimples(1000, 5, 3);

        DecimalFormat formato = new DecimalFormat("R$ #,##0.00");
        String valorFormatado = formato.format(resultado);

        System.out.println("\nMontante final: " + valorFormatado);
    }
}
