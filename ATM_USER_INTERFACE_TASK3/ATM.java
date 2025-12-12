import java.util.Scanner;
public class ATM 
{
  public static void main(String[] args) {
      
        // object for the user
        User user=new User("Monica","0111",3000.00);
        Scanner sc=new Scanner(System.in);
        System.out.println("=====WELCOME TO OIB-SIP ATM=====");
    //    boolean logged=false;
      //  int tries=3;
       /*  while(tries<3 && !logged)
        {
            System.out.println("USER ID :");
            String id=sc.nextLine().trim();
            System.out.println("PIN :");
            String pin=sc.nextLine().trim();

            if(user.authenticate(id,pin))
            {
                logged=true;
                System.out.println("LOGINNED SUCCEFULLY!!");
            }
            else{
                tries++;
                System.out.println("INVALID USER ID OR PIN!! TRY AGAIN"+ (3-tries)+" LEFT ");
            }
        }
        if(!logged)
        {
            System.out.println("TOO MANY FAILED ATTEMPTS!! EXITING...");
        }*/int maxAttempts = 5;
int attempts = 0;

while (attempts < maxAttempts) {
    System.out.print("Enter User ID: ");
    String enteredId = sc.nextLine().trim();
    System.out.print("Enter PIN: ");
    String enteredPin = sc.nextLine().trim();

    if (user.authenticate(enteredId, enteredPin)) {
        System.out.println("Login successful!\n");
        break;
    } else {
        attempts++;
        int left = maxAttempts - attempts;
        if (left > 0) {
            System.out.println("Invalid ID or PIN. Attempts remaining: " + left + "\n");
        } else {
            System.out.println("TOO MANY FAILED ATTEMPTS!! EXITING...");
            System.exit(0); // program stops
        }
    }
}

        //OPERATION TO SHOW AFTER LOGINNED SUCCESSFULLY
        @SuppressWarnings("unused")
        boolean running=true;
        while(running)
        {
            System.out.println("==ATM MENU==\n");
            System.out.println("1. CHECK BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. TRANSACTION HISTORY");
            System.out.println("5. PRINT RECEIPT");
            System.out.println("6. QUIT");
            System.out.println("\n CHOOSE AN OPTION :");
            int choice=-1;
            try{
                choice=Integer.parseInt(sc.nextLine().trim());
            }catch(NumberFormatException e)
            {
                System.out.println("INVALID INPUT");
                continue;
            }
            switch(choice)
            {
                case 1: 
                      ATMOperations.checkBalance(user);
                      break;
                case 2:
                      ATMOperations.Deposit(user,sc);
                      break;
                case 3:
                      ATMOperations.Withdraw(user,sc);
                      break;
                case 4:
                    ATMOperations.transactionHistory(user);
                    break;
                case 5:
                    ATMOperations.printReceipt(user);
                    break;
                case 6:
                    if(ATMOperations.quit(user,sc))
                    {
                        running=false;
                    }
                    break;
                default:
                    System.out.println("INVALID OPTION");
            }
  }  
}
}