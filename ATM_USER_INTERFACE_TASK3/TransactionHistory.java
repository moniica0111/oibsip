import java.util.ArrayList;

public class TransactionHistory {

    private ArrayList<String> history = new ArrayList<>();

    public void add(String detail) {
        history.add(detail);
    }

    public void print() {
        System.out.println("\n--- Transaction History ---\n");
        System.out.println("=====================================\n");
        if (history.isEmpty()) {
            System.out.println(" No transactions yet.\n");
            return;
        }
        for (String h : history) {
            System.out.println(h);
        }
    }
}