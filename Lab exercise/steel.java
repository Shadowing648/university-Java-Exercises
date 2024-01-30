//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto
import java.util.Scanner;

public class steel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a dureza do aço: ");
        int dureza = scanner.nextInt();

        System.out.print("Digite o teor de carvão do aço: ");
        double teorCarvao = scanner.nextDouble();

        System.out.print("Digite a resistência à tração do aço: ");
        int resistenciaTracao = scanner.nextInt();

        int pontuacao = calculandoPontuacao(dureza, teorCarvao, resistenciaTracao);

        System.out.println("Pontuação do aço: " + pontuacao);


    }

    public static int calculandoPontuacao(int dureza, double teorCarvao, int resistenciaTracao) {
        int pontuacao;

        if (dureza > 50 && teorCarvao < 0.7 && resistenciaTracao > 5600) {
            pontuacao = 10;
        } else if (dureza > 50 && teorCarvao < 0.7) {
            pontuacao = 9;
        } else if (teorCarvao < 0.7 && resistenciaTracao > 5600) {
            pontuacao = 8;
        } else if (dureza > 50 && resistenciaTracao > 5600) {
            pontuacao = 7;
        } else if (dureza > 50 || teorCarvao < 0.7 || resistenciaTracao > 5600) {
            pontuacao = 6;
        } else {
            pontuacao = 5;
        }

        return pontuacao;
    }
}
