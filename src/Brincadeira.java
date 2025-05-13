import java.util.Scanner;

public class Brincadeira {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = leia.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        leia.nextLine();

        System.out.print("Oi " + nome + ", tudo bem com você? (Sim/Não): ");
        String resposta = leia.nextLine().trim().toLowerCase();

        if (resposta.equals("sim")) {
            System.out.println("Ahhh " + nome + ", com " + idade + " anos e já se achando a última bolacha do pacote! 😂");
        } else if (resposta.equals("não")) {
            System.out.println("Ei, " + nome + ", infelizmete não posso fazer nada, mas melhore ai ! 💪✨");
        } else {
            System.out.println("Resposta não reconhecida,tem que informar sim ou não! 😊");
        }

        leia.close();
    }
}
