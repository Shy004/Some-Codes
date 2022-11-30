import java.util.Scanner;
import java.util.Random;

public class condicional4 {
    public static void main(String[] args) {
        Random random = new Random(6);
        Scanner scanner = new Scanner(System.in);

        int numero;
        int numeroSorteado = random.nextInt(1, 6);

        System.out.println("Um número de 1 à 6:");
        numero = scanner.nextInt();

        if (numero < 1 || numero > 6) {
            System.out.println("O numero selecionado foi " + numero);
            System.out.println("Erro! Escolha um valor entre 1 e 6");
        } else if (numero == numeroSorteado) {
            System.out.println("O número selecionado foi " + numero);
            System.out.println("O número sorteado foi " + numeroSorteado);
            System.out.println("Acertou!");
        } else if (numero!= numeroSorteado) {
            System.out.println("O numero selecionado foi " + numero);
            System.out.println("O numero sorteado foi " + numeroSorteado);
            System.out.println("Errou!");
        }
    }
}