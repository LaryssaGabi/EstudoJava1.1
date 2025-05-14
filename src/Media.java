import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma nota para o filme top Gun: ");
        double nota1 = leia.nextDouble();

        System.out.print("Digite uma nota para o filme Marvel: ");
        double nota2 = leia.nextDouble();

        System.out.print("Digite uma nota para o Naruto: ");
        double nota3 = leia.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media dos filmes é :" + media);

        leia.close();
    }
}
