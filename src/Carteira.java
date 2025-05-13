import java.util.Scanner;

public class Carteira {
    public static void main (String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = leia.nextInt();

        if (idade >= 18){
            System.out.println("Você já pode tirar a carteira de motorista! 🚗");
        }else {
            System.out.println("Ops, ainda não pode! 😅");
        }

        leia.close();
    }
}
