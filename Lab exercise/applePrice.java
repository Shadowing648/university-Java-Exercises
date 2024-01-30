//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto
import java.util.Scanner;

public class applePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá! Quantas maçãs deseja comprar?");
        int qtd = input.nextInt();

        double price = calculatePrice(qtd);

        System.out.println("O preço da compra é: " + price + "R$");
    }

    public static double calculatePrice(int quantity) {
        double price;

        if (quantity <= 11) {
            price = quantity * 1.30;
        } else {
            price = quantity * 1.00;
        }

        return price;
    }
}
