/*Uma das primeiras aplicações de computadores foi o cálculo de trajetória de projéteis.
Se um projétil é atirado com um velocidade inicial V(m/s) a um ângulo de inclinação 0 (radianos),
a sua posição no plano vertical (x, y) no tempo t(segundos) é calculada pelas fórmulas:
x=v* cos(0)*t
y= (v*sen(0)*t) - (0,5g*t²)
Onde: 0 < 0 < π/2 e g = 9,8ms²
Faça um programa que, dados os parâmetros 0 e V, liste as coordenadas x e y em intervalos de 0,01 segundo para um tiro
em particular, terminando a listagem quando o projétil atingir o solo. Dica: Importe java.lang.math para uso do seno e cosseno.*/
package s2exercicios;

import java.util.Scanner;

public class Primeira_MaratonaIndividual {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        //Constante da gravidade
        double g = 9.8;

        //Variáveis
        double t = 0.0;
        double x , y;

        //Entrada dos parâmetros
        System.out.print("Digite a velocidade inicial (m/s): ");
        double v = scanner.nextDouble();

        System.out.print("Digite o ângulo de inclinação (graus): ");
        double anguloGraus = scanner.nextDouble();

        //Converter o ângulo para radianos
        double angulo = Math.toRadians(anguloGraus);

        System.out.println("\nTrajetória do projétil:");
        System.out.println("Tempo (s)\tX (m)\tY (m)");

        //Cálculo da trajetória
        do{
            x = v * Math.cos(angulo) * t;
            y = v * Math.sin(angulo) * t - (g * Math.pow(t, 2) / 2);

            System.out.printf("%.2f\t\t%.2f\t%.2f\n", t, x, y);
            t += 0.1;
        } while(y >= 0);

        scanner.close();
    }
}
