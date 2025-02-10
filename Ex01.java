/*Ex01 - Crie um método estático chamado converterMoeda() que recebe um valor em reais (R$) e uma taxa de conversão para dólares(USD) e retorna o valor convertido.
 *  Entrada:
 * Valor em reais: 100.0
 * Taxa de conversão: 4.90
 *
 * Saída:
 * 100.0 reais equivalem a 20.41 dólares */
package s4exercicios.Ex01;

public class Ex01 {
    public static double converterMoeda(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        double resultado = converterMoeda(100, 4.90);
        System.out.printf("\nR$:100,00 reais equivalem a R$ %.2f%n", resultado);
    }
}

