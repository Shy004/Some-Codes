import java.util.Random;
import java.util.Scanner;

public class lacos3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int jogadas;
        int soma = 0;

        System.out.println("Quantas vezes o dado será lançado?");
        jogadas = scanner.nextInt();

        for(int contador = 0; contador < jogadas; contador++) {
            int valores = random.nextInt(1, 6);
            soma += valores;
            System.out.println("O número sorteado foi: " + valores);
        }
        System.out.println("A soma dos números é: " + soma);
    }
}