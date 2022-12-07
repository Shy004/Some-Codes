import java.util.Scanner;

public class variavel1 {
    public static void main(String[] args) {

        System.out.println("Para saber a idade...");

        //Inserindo idade
        int diaAtual = actualDay();
        int mesAtual = actualMonth();
        int anoAtual = actualYear();
        int diaNasc = birthdayDay();
        int mesNasc = birthdayMonth();
        int anoNasc = birthdayYear();
        int calculoAnos = (anoAtual - anoNasc);
        int calculoMeses = (mesAtual - mesNasc);
        int calculoDias = (diaAtual - diaNasc);

        if (calculoDias < 0){
            calculoDias = calculoDias * (-1);
        }
        if (calculoMeses < 0){
            calculoMeses = calculoMeses * (-1);
        }

        String anos = calculoAnos + " anos, ";
        String meses = calculoMeses + " meses, ";
        String dias = calculoDias + " dias";
        String idadeBase = "A idade do indivíduo tem " + anos + meses + dias;
        String idade = idadeBase + " de idade.";

        System.out.println(idade);
    }

    //Função inserção da data Atual
    public static int actualDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o dia atual: ");
        return scanner.nextInt();
    }

    public static int actualMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o mês atual: ");
        return scanner.nextInt();
    }

    public static int actualYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o ano atual: ");
        return scanner.nextInt();
    }

    //Função inserção da data de Nascimento
    public static int birthdayDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o dia de nascimento: ");
        return scanner.nextInt();
    }
    public static int birthdayMonth(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o mês de nascimento: ");
        return scanner.nextInt();
    }
    public static int birthdayYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o ano de nascimento: ");
        return scanner.nextInt();
    }
}
