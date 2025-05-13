import java.util.Scanner;

public class Leitor {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = leia.nextInt();
        leia.nextLine();

        System.out.println("Digite o seu cargo: ");
        String cargo = leia.nextLine();

        System.out.println("A sua idade é: " + idade);
        System.out.println("O seu nome é: " + nome);
        System.out.println("O seu cargo é: " + cargo);

        leia.close();
    }
}
