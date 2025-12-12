

public class Deposit {
    public static void execute(User user,double amount)
    {
        user.addBalance(amount);
        user.getHistory().add("DEPOSITED ₹ "+ amount);
    }
}
