public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lamçamento que os clientes estão curtindo");
        }else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filmeliberado");
        }else {
            System.out.println("Deve pagar o aluguel do filem");
        }
    }
}
