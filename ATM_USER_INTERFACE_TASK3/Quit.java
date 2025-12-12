public class Quit {

    public static void printReceipt(User user) {
        System.out.println("\n===== RECEIPT =====\n");
        System.out.println("  Final Balance: ₹ " + user.getBalance());
        System.out.println("\n======Transactions====== ");
        user.getHistory().print();
        System.out.println("====================\n");
    }
}