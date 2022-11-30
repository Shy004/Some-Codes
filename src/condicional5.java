import java.util.Scanner;

public class condicional5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        double inss1 = 0.075;
        double inss2 = 0.09;
        double inss3 = 0.12;
        double inss4 = 0.14;
        double impostOficial;
        double imposto1 = 90.9;
        double imposto2 = 109.38;
        double imposto3 = 145.64;
        double imposto4 = 482.46;

        System.out.println("Insira seu sálario: ");
        salario = scanner.nextDouble();

        if (salario <= 1212) {
            System.out.println("Seu imposto é de: " + (impostOficial = salario * inss1));
        } else if
            (salario >= 1212.01 && salario <= 2427.35) {
            salario = salario - 1212;
            System.out.println("Seu imposto é de: " + (impostOficial = salario * inss2 + imposto1));
        }else if (salario >= 2427.36 && salario <= 3641.03) {
            salario = salario - 2427.35;
            System.out.println("Seu imposto é de: " + (impostOficial = salario * inss3 + imposto1 + imposto2));
        } else if (salario >= 3641.04 && salario <= 7087.22) {
            salario = salario - 3641.03;
            System.out.println("Seu imposto é de: " +
                    (impostOficial = salario * inss4 + imposto1 + imposto2 + imposto3));
        } else if (salario >= 7087.23 && salario <= 8000) {
            salario = salario - 7087.22;
            System.out.println("Seu imposto é de: " +
                    (impostOficial = salario * inss4 + imposto1 + imposto2 + imposto3 + imposto4));
        } else if (salario >= 8001){
            System.out.println("Não paga imposto!");
        }
    }
}
