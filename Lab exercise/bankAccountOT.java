//Aluno: Luiz Gonzaga de Albuquerque Montenegro Neto
import java.util.Scanner;

public class bankAccountOT {
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
        balanceStatus(currentBalance);


    }

    public static double calculateBalance(double initialBalance, double debit, double credit) {
        return initialBalance - debit + credit;
    }

    public static void balanceStatus(double currentBalance) {
        System.out.println("Saldo atual da conta é: " + currentBalance);
        System.out.println(currentBalance >= 0 ? "Saldo positivo" : "Saldo negativo");
    }
}

