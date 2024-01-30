//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto
import java.util.Scanner;
public class applePriceOT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá! Quantas maçãs deseja comprar?");
            int qtd = input.nextInt();

        double price = calculatePrice(qtd);

        System.out.println("O preço da compra é: " + price + "R$");

    }

    public static double calculatePrice(int quantity) {
        return (quantity<=11) ? quantity * 1.30 : quantity * 1.00;
    }


}

