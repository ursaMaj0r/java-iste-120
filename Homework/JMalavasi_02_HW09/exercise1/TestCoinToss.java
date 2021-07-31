import java.util.*; // import scanner class

/**
 * TestCoinToss - Class to test CoinToss Class
 *
 * @author Malavasi
 * @version 20210411
*/

public class TestCoinToss
{
   public static void main(String[] args)
   {      
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // declare variables
      int numTosses = 0;
   
      while ( numTosses < 2 )
      {
         // prompt for number of tosses
         System.out.print("Enter integer number ( >= 2) coin tosses or 0 to Exit: ");
         numTosses = in.nextInt(); in.nextLine();
            
         // if 0 exit, else do calculations   
         if ( numTosses == 0 )
         {
            System.exit(0);
         }
         else
         {
            // instantiate coin toss
            CoinToss toss = new CoinToss(numTosses);
         
            System.out.printf("\nNumber of Coin Tosses: %d\n",toss.getNumTosses()); // print coin tosses
            System.out.printf("Fraction of Heads: %.3f\n",( (double) toss.getNumHeads()/toss.getNumTosses())); // print heads
            System.out.printf("Fraction of Tails: %.3f\n",( (double) toss.getNumTails()/toss.getNumTosses())); // print heads
            toss.computeLongestRun(); // compute longest run
            System.out.printf("Longest run is %d %s\n", toss.getLongestRun(), toss.getLongestOutcome());
            numTosses = 0; // reset tosses
         }
      }
   }
}