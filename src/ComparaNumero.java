import java.util.Scanner;

public class ComparaNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        int numero1 = leia.nextInt();

        System.out.print("Digite novamente um número inteiro:");
        int numero2 = leia.nextInt();

        if (numero1 == numero2){
            System.out.println("Os número informado são iguais");
        }else if (numero1 > numero2){
            System.out.println("O primeiro núemro é maior");
        }else {
            System.out.println("O segundo número é maior");
        }


    }
}
