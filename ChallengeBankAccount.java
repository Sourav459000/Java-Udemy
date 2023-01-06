// Working but not as I wanted
import java.util.Scanner;

public class ChallengeBankAccount {
    static Scanner scanner = new Scanner(System.in);
    static challengeBankClass CBC = new challengeBankClass();
    public static void main(String[] args) {
        System.out.println("Welcome to Apna Bank.");
        String ch = "yes";
        mains(ch);
    }
    public static void mains(String ch) {
        do {
            System.out.println("What would you like to do?\n1. Withdraw.\n2. Deposit.");
            int choice= scanner.nextInt();
            switch (choice) {
                case 1:
                    CBC.cashWithdrawal();
                    break;
                case 2:
                    CBC.cashDeposit();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("Enter 'yes' to perform again and enter 'no' to exit.");
            ch = scanner.next().toLowerCase();
        } while (ch == "yes");
    }
}
