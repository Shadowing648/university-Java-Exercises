//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto.
import java.util.Scanner;

public class comprasDeMercado {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Mercado Seu geraldo oque deseja?");
        exibirMenu();
        selecaoDoCarrinho();

    }
    public static void exibirMenu(){
        System.out.println("1. Arroz - 8 usd");
        System.out.println("2. Feijão - 10 usd");
        System.out.println("3. Batata - 15 usd");
        System.out.println("4. Carne - 100 usd");
        System.out.println("0. Sair");

    }
    public static void selecaoDoCarrinho(){
        double compras = 0.0;

        while (true){
            Scanner input = new Scanner (System.in);
            System.out.println("Digite a opção que deseja comprar.");
                int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    compras += 8;
                    break;
                case 2:
                    compras += 10;
                    break;
                case 3:
                    compras += 15;
                    break;
                case 4:
                    compras += 100;
                    break;
                case 0:
                    System.out.println("Total de compras: " + compras + "USD");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
                    System.out.println("Digite a opção que deseja comprar.");
                    exibirMenu();
                    break;
            }
        }
    }
}