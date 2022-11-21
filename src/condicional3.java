import java.util.Scanner;

public class condicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int parcelas;
        double renda;
        double valor;

        boolean idadeAprovada = false;
        boolean parcelasAprovado = false;
        boolean valorAprovado = false;

        System.out.println("Insira idade: ");
        idade = scanner.nextInt();

        if (idade >= 18 && idade <= 65) {
            idadeAprovada = true;
            System.out.println("Idade aprovada");
        } else {
            System.out.println("Idade recusada");
        }

        System.out.println("Insira parcelas: ");
        parcelas = scanner.nextInt();

        if (parcelas >= 3 && parcelas <= 24) {
            parcelasAprovado = true;
            System.out.println("Nº de parcelas aprovado");
        } else {
            System.out.println("Nº de parcelas invalido");
        }

        System.out.println("Insira sua renda: ");
        renda = scanner.nextDouble() * 0.30;
        System.out.println(renda);

        System.out.println("Insira valor do empréstimo: ");
        valor = scanner.nextDouble() / parcelas;
        System.out.println(valor);

        if (valor <= renda) {
            valorAprovado = true;
            System.out.println("Valor aprovado");
        } else {
            System.out.println("Valor indisponível");
        }

        if (idadeAprovada && parcelasAprovado && valorAprovado) {
            System.out.println("Empréstimo aprovado!");
        } else
            System.out.println("Empréstimo recusado!");
    }
}
