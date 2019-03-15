/*
                       !!!PROGRAM TO FLIP COIN AND LET USER GUESS (H/T)!!!
*/
import java.util.Scanner;                           //For I/O functions
public class Toss
{
    public static void main(String ar[])
    {
        Scanner input = new Scanner(System.in);      //To create an object of Scanner class

        //to find out random number between 0 & 1
        int result = (int) (Math.round(Math.random()));

        //Below statement will convert 0 & 1 into head and tails
        String value = (result == 0) ? "Heads" : "Tails";

        System.out.print("\nEnter your Guess(head/tails):- ");
        String choice = input.nextLine();               //To input guess by user

        String decide = (choice.equalsIgnoreCase(value) ? "You Win!!":
                "Better Luck Next Time");        //To Compare the user guess and the result
        System.out.print("\nThe result of toss is:-" + value);
        System.out.println("\n" + decide);
    }
}
/*
                                    !!! THE END !!!
                                       THANK YOU
 */
