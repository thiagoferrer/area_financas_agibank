/*Ex01 - Controle de Saldo de Contas
 * Crie um programa que armazena os saldos de 10 contas bancárias em um valor.
 * O usuário deve poder buscar o saldo de uma conta pelo índice do valor.
 *
 * - Se o usuário inserir um índice inválido, capturar e trate ArrayIndexOutOfBoundsException.
 *
 * Exemplo de Entrada:
 * Digite o índice da conta: 12
 *
 * Saída Esperada:
 * Erro: Conta não encontrada!*/
package s4exercicios.Ex11;

public class ControleSaldoContas {
    public static void main(String[] args) {
        int tamanhoContas = 10;
        int indiceConta = 12;
        int[] saldo = new int[tamanhoContas];

        for (int i = 0; i < tamanhoContas; i++) {
            saldo[i] = i * 10;
        }

        try {
            if (indiceConta < 0 || indiceConta >= tamanhoContas) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.printf("Saldo da conta no índice %d: R$ %d\n", indiceConta, saldo[indiceConta]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nErro: Conta não encontrada!");
        }
    }
}



