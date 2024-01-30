//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto
import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Número da conta:");
        int accountNumber = scanner.nextInt();

        System.out.print("Saldo inicial: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Débito: ");
        double debit = scanner.nextDouble();

        System.out.print("Crédito: ");
        double credit = scanner.nextDouble();


        double currentBalance = calculateBalance(initialBalance, debit, credit);
        BalanceStatus(currentBalance);



    }

    public static double calculateBalance(double initialBalance, double debit, double credit) {
        return initialBalance - debit + credit;
    }

    public static void BalanceStatus(double currentBalance) {
        System.out.println("saldo atual: " + currentBalance);
        if (currentBalance >= 0) {
            System.out.println("saldo positivo");
        } else {
            System.out.println("saldo negativo");
        }
    }
}
