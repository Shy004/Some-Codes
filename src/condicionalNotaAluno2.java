public class condicionalNota2 {
    public static void main(String[] args) {
        double note1 = 2;
        double note2 = 4;
        double note3 = 3;
        double note4 = 1;
        double finalNote = (note1 + note2 + note3 + note4) / 4;
        System.out.println(finalNote);
        if (finalNote >= 6) {
            System.out.println("O aluno foi aprovado");
        }
        else System.out.println("O aluno foi reprovado");
    }
}

