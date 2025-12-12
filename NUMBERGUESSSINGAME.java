import java.util.Random;
import javax.swing.JOptionPane;

public class NUMBERGUESSSINGAME{
    public static void main(String[] args)
    {
        Random rand=new Random();
        int randnum= rand.nextInt(100)+1;
        int maxlimit=5;
        int trial=0;
        boolean  guessed=false;
        JOptionPane.showMessageDialog(null,"WELCOME PLAYER !! YOU ARE HERE TO PLAY THE NUMMBER GUESSING GAME RIGHT??\n\n YOU HAVE TO GUESS A NUMBER BETWEEN 1 TO 100.\n\n YOU HAVE MAXIMUM OF "+maxlimit+" TRIALS  TO GUESS THE NUMBER.\n\n ALL THE BEST!!");
        while (trial<maxlimit && !guessed)
        {
            String input=JOptionPane.showInputDialog(null,"ENTER YOUR GUESS : ");
            int guess;
            try
            {
            guess=Integer.parseInt(input.trim());
            trial++;}catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"INVALID INPUT-__-");continue;
                        }
                        if(guess==randnum)
                        {
                            JOptionPane.showMessageDialog(null,"CONGRATULATIONS!! YOU GUESSED RIGHT...HURRAYYY!!");
                            guessed=true;
                        }
                        else if(guess<randnum)
                        {
                            JOptionPane.showMessageDialog(null,"OOPS SORRY !! YOUR GUESS IS LOWER THAN THE ACTUAL  NUMBER");
                           // trial++;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"OOPS SORRY !! YOUR GUESS IS HIGHER THAN THE ACTUAL  NUMBER");
                            //trial++;
                        }


        }
        if(!guessed)
        {
            JOptionPane.showMessageDialog(null,"SORRY YOU HAVE USED ALL THE TRIALS.. THE CORRECT NUMBER IS "+ randnum+" BETTER LUCK NEXT TIME!!");
        }
        int option=JOptionPane.showConfirmDialog(null,"DO YOU WANT TO PLAY AGAIN??","PLAY AGAIN?",JOptionPane.YES_NO_OPTION);
         if(option==JOptionPane.YES_OPTION)
         {
            main(null);
         }
         else{
            JOptionPane.showMessageDialog(null,"THANK YOU FOR PLAYING!!");
            System.exit(0);
         }

    }
}

