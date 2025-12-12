

public class Withdraw {
    
    public static boolean execute(User user,double amount)
    {
        boolean ok=user.deductBalance(amount);
        if(ok)
        {
            user.getHistory().add("WITHDRAWN ₹ "+amount);
        }
        return ok;
    }
}
