import java.util.Scanner;

public class ParImpa {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O número é par!");
        } else {
            System.out.print("O número é ímpar!");
        }

        leia.close();
    }
}
