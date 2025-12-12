

public class User {
    @SuppressWarnings("FieldMayBeFinal")
    private String userid;
    @SuppressWarnings("FieldMayBeFinal")
    private String pin;
    private double balance;
    private TransactionHistory history=new TransactionHistory();
    public User(String userid,String pin,double balance)
    {
        this.userid=userid;
        this.pin=pin;
        this.balance=balance;
    }
    public boolean authenticate(String id,String pin)
    {
        return this.userid.equals(id) && this.pin.equals(pin);
    }
    public double getBalance()
    {
        return balance;
    }
    public void addBalance(double amt)
    {
        balance+=amt;
    }
    public boolean deductBalance(double amt)
    {
        if(balance>=amt)
        { balance-=amt;
         return true;
        }return false;
    }
    public TransactionHistory getHistory()
    {
        return history;
    }
    
}
