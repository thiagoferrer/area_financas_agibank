package s3exercicios;

public class CarteiraAcoes {
    public static void main(String[] args) {

        double[] carteira = {5000.0, 3000.0, 7000.0, 4000.0, 6000.0};//Declarar o vetor dos valores

        double total = 0;
        double percentual;

        for(int i = 0; i < carteira.length; i++ ){
            total = total + carteira[i];
        }

        //Total Investido
        System.out.printf("Total investido: R$ %.2f%n", total);

        for (int i = 0; i < carteira.length; i++){
            percentual = (carteira[i] / total) * 100;
            System.out.printf("%.2f%% ", percentual);
        }
    }
}
