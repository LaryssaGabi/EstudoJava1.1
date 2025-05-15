import java.util.Scanner;

public class Solicite {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um núemero: ");
        double numero = leia.nextDouble();

        if (numero > 0){
            System.out.print("O núemro infomado é positivo");
        }else {
            System.out.print("Onúmero informado é negativo");
        }
    }
}
