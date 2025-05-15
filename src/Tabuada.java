import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        double numero = leia.nextDouble();;

        for (int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
