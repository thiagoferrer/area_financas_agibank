/*Ex03 - Implemente um método chamado calcularCrescimento() que recebe o preço de uma ação em dois dias consecutivos
e calcular a variação percentual.
Entrada:
preço no dia: 100.0
Preço no dia: 105.0

Saída:
Crescimento: 5.0% */

package s4exercicios.Ex03;

public class Ex03 {
    public static double calcularCrescimento(double dia1, double dia2) {
        return (dia2 - dia1) / 100 * 100;
    }

    public static void main(String[] args) {
        double resultado = calcularCrescimento(100.0, 105.0);
        System.out.println("\nCrescimento: " + resultado + "%");
    }
}
