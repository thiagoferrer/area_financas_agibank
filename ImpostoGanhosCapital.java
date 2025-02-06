package s3exercicios;

public class ImpostoGanhosCapital {
    public static void main(String[] args) {

        double[] precoCompra = {10000.0, 8000.0, 12000.0, 7000.0, 15000.0};
        double[] precoVenda = {12000.0, 8500.0, 14000.0, 7200.0, 18000.0};

        double imposto = 0;
        double lucroTotal = 0;

        for (int i = 0; i < precoCompra.length; i++ ){
            double lucroAtivo = precoVenda[i] - precoCompra[i];
            lucroTotal += lucroAtivo;
        }
        if (lucroTotal > 20000){
            imposto = (lucroTotal - 20000) * 0.15;
        }

        System.out.println("Lucro total: R$ " + lucroTotal);
        if(imposto > 0){
            System.out.println("Imposto devido : R$ " + imposto);
        } else {
            System.out.println("Sem imposto devido.");
        }
    }
}
