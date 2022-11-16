import java.util.Scanner;

public class variavel7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoDeNascimento;
        int anoAtual = 2022;

        System.out.println("Coloque o seu ano de nascimento: ");
        anoDeNascimento = scanner.nextInt();

        int idade = anoAtual - anoDeNascimento;

        System.out.println("Sua idade é " + idade);
    }
}
