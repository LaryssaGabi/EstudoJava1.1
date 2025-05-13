import java.util.Scanner;

public class Leitura {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digita o nome de um filme;");
        String filme = leia.nextLine();

        System.out.println("Digite um numero:");
        double numero =leia.nextDouble();

        System.out.println(filme);
        System.out.println(numero);
    }

}
