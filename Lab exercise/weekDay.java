//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto
import java.util.Scanner;

public class weekDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para representar o dia da semana:");
        int number = input.nextInt();

        String day = weekDayfunction(number);

        System.out.println("O dia da semana correspondente ao número " + number + " é: " + day);
    }

    public static String weekDayfunction(int number) {
        String day;

        switch (number) {
            case 1:
                day = "Domingo";
                break;
            case 2:
                day = "Segunda-feira";
                break;
            case 3:
                day = "Terça-feira";
                break;
            case 4:
                day = "Quarta-feira";
                break;
            case 5:
                day = "Quinta-feira";
                break;
            case 6:
                day = "Sexta-feira";
                break;
            case 7:
                day = "Sábado";
                break;
            default:
                day = "Número inválido. Digite um número de 1 a 7.";
        }

        return day;
    }
}
