public class condicionalNota1 {
    public static void main(String[] args) {
        double note1 = 5;
        double note2 = 8;
        double note3 = 6;
        double note4 = 7;
        double finalNote = (note1 + note2 + note3 + note4) / 4;
        System.out.println(finalNote);
        if (finalNote >= 6) {
            System.out.println("O aluno foi aprovado");
        }
        else System.out.println("O aluno foi reprovado");
    }
}
