import java.util.Scanner;

public class ATMOperations {

    // Print current balance
    public static void checkBalance(User user) {
        System.out.printf("Current balance: ₹ %.2f%n \n", user.getBalance());
    }

    // Deposit: read input, validate, call deposit logic
    public static void Deposit(User user, Scanner sc) {
        System.out.print("\n Enter amount to deposit: ");
        String line = sc.nextLine().trim();
        double amt;
        try {
            amt = Double.parseDouble(line);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }
        if (amt <= 0) {
            System.out.println("Enter a positive amount.");
            return;
        }
        Deposit.execute(user,amt);
        System.out.printf("   Deposited ₹ %.2f.\n New balance: ₹ %.2f%n", amt, user.getBalance());
    }

    // Withdraw: read input, validate, call withdraw logic
    public static void Withdraw(User user, Scanner sc) {
        System.out.print("\nEnter amount to withdraw: ");
        String line = sc.nextLine().trim();
        double amt;
        try {
            amt = Double.parseDouble(line);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.\n");
            return;
        }
        if (amt <= 0) {
            System.out.println("\n Enter a positive amount.");
            return;
        }
        boolean success = Withdraw.execute(user, amt);
        if (success) {
            System.out.printf("Please collect cash.\nNew balance: ₹ %.2f%n \n\n", user.getBalance());
        } else {
            System.out.println("Insufficient balance.\n");
        }
    }

    // Print transaction history
    public static void transactionHistory(User user) {
        user.getHistory().print();
    }

    // Print receipt (does not exit)
    public static void printReceipt(User user) {
        Quit.printReceipt(user);
    }

    // Confirm quit: returns true to exit
    public static boolean quit(User user, Scanner sc) {
        System.out.print("Confirm quit? (y/n): ");
        String ans = sc.nextLine().trim().toLowerCase();
        if (ans.equals("y") || ans.equals("yes")) {
            Quit.printReceipt(user);
            return true;
        }
        return false;
    }
}
