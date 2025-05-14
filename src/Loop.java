import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double mediaDaAvaliacao = 0;
        double nota = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite sua nota para o filme: ");
            nota = leia.nextDouble();
            mediaDaAvaliacao += nota;
        }
        System.out.print("Media de avaliação: " + mediaDaAvaliacao / 5);

    }
}
