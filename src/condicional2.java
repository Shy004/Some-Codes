import java.util.Scanner;

public class condicional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //Determinando variáveis
        double temperatura;
        String unidade;
        double resultado = 0;

    //Definindo Celsius ou Fahrenheit
        System.out.println("Inserir unidade: ");
        unidade = scanner.nextLine();

    //Definindo a temperatura
        System.out.println("Inserir valor: ");
        temperatura = scanner.nextDouble();

    //Conversão
        if(unidade.equals("C")) {
            resultado = (temperatura * 9 / 5) + 32;
        } else if (unidade.equals("F")) {
            resultado = (temperatura - 32) * 5/9;
        } else {
            System.out.println("Impossível calcular");
        }

        System.out.println(resultado);
    }
}