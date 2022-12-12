import java.util.Random;
import java.util.Scanner;

public class lacos4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroDesejado;
        int numeroSorteado = 0;
        int contador = 0;

        System.out.println("Qual o número desejado? ");

        try {
            numeroDesejado = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Erro, insira um numeral!");
            return;
        }

        if (numeroDesejado < 0 || numeroDesejado > 6) {
            System.out.println("Erro, insira algo entre 1 e 6!");
            return;
        }

        while (numeroSorteado != numeroDesejado){
            contador = contador + 1;
            numeroSorteado = random.nextInt(1, 7);
            System.out.println("O número sorteado foi: " + numeroSorteado);
            String sorteios = contador + " sorteios";

            if (numeroSorteado == numeroDesejado) {
                System.out.println("Sorte!");
                System.out.println("Foram necessários " + sorteios);
            }
        }
    }
}