import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Vamos brincar de adivinhar...");
        System.out.println("REGRA: Apenas números inteiros!");
        System.out.println("Boa Sorte!!");

        int numeroGerado = new Random().nextInt(100);
        int numeroTentativas = 0;
        int numeroDigitado = 0;

        while (numeroTentativas < 5){
            System.out.print("Digite um numero entre 0 e 100:");
            numeroDigitado = leia.nextInt();
            numeroTentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns, você acertou o número em " + numeroTentativas + " tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o número gerado.");
            }else {
                System.out.println("O número digitado é maior que  o número gerado");
            }
        }

        if (numeroTentativas == 5 && numeroDigitado != numeroGerado){
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }

    }
}
