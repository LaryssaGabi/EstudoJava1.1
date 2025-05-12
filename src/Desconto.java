public class Desconto {
    public static  void main(String[] args){
        double precoOriginal = 128.90;
        double percentualDesconto = 0.10;

        double desconto = ( precoOriginal * percentualDesconto);
        double valorComDesconto = precoOriginal - desconto;

        System.out.println("O valor do produto com desconto é " + valorComDesconto);

    }
}
