import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double mediaDaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while (nota != -1) {
            System.out.print("Digite sua nota para o filme ou -1 para encerrar: ");
            nota = leia.nextDouble();

            if (nota != -1) {
                mediaDaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        System.out.print("Media de avaliação: " + mediaDaAvaliacao / totalDeNotas);
    }
}
