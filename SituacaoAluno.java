//Crie um programa que verifique a situação de um aluno, através da sua nota final numa disciplina.
//Aprovado: 6 ou acima;
//Exame: entre 4 (inclusive) e 6 (exclusive).
//Reprovado: abaixo de 4.

package s2exercicios;

import java.util.Scanner;

public class SituacaoAluno {
    public static void main(String[] args) {
        //Criar um scanner para entrada do usuário:
        Scanner scanner = new Scanner(System.in);

        //Socilitar a nota final do aluno
        System.out.print("Digite a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();

        //Verificar a situação do aluno:
        if (notaFinal >= 6){
            System.out.println("Situação: Aprovado!");
        } else if(notaFinal >= 4.0 && notaFinal < 6.0){
            System.out.println("Situação: Exame.");
        } else {
            System.out.println("Situação: Reprovado!");
        }

        //Fechar o scanner
        scanner.close();
    }
}
