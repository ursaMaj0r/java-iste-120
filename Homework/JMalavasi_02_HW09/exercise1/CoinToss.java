import java.util.*;
/**
 * Class to model Coin Toss
 *
 * @author Malavasi
 * @version 20210411
*/

public class CoinToss
{
   private int numTosses; // determines number of coin tosses
   private char[] tosses; // data array to store tosses
   private int numHeads; // number of tosses that landed heads
   private int numTails; // number of tosses that landed tails
   private int longestRun; // longest run with same outcome
   private char longestOutcome; // outcome of longest run

   /**
   * Parameterized Constructor
   * @param numTosses number of tosses to simulate
   */
   public CoinToss(int numTosses)
   {
      // default params
      this.numTosses = numTosses;
      tosses = new char[numTosses];
      numHeads = 0;
      numTails = 0;
      longestRun = 0;
      longestOutcome = 'x';
      char outcome;
      
      // fill array
      Random generator = new Random();
      for(int toss = 0; toss < numTosses; toss++)
      {
         // declare variables         
         double flip = Math.round(Math.random()); // holds rand number
         
         if (flip == 1)
         {
            outcome = 'h';
            numHeads++;
         }
         else
         {
            outcome = 't';
            numTails++;
         }
         
         tosses[toss] = outcome;
      }
   }
   
   /**
   * retrieves the number of simulated tosses
   * @return the number of tosses.
   *
   */ 
   public int getNumTosses()
   {
      return numTosses;
   }
   
      
   /**
   * retrieves the number of tosses that landed heads
   * @return the number of tosses.
   *
   */ 
   public int getNumHeads()
   {
      return numHeads;
   }
     
   /**
   * retrieves the number of simulated tosses that landed tails
   * @return the number of tosses.
   *
   */ 
   public int getNumTails()
   {
      return numTails;
   }
   
   /**
   * retrieves the longest run
   * @return the length of the run.
   *
   */ 
   public int getLongestRun()
   {
      return longestRun;
   }
   
   /**
   * retrieves the outcome of the longest run
   * @return the length of the run.
   *
   */ 
   public char getLongestOutcome()
   {
      return longestOutcome;
   }
   
   /**
   * sets the longest run
   * @param newRunLength the new length of the longest run.
   *
   */ 
   public void setLongestRun(int newRunLength)
   {
      longestRun = newRunLength;
   }
   
   /**
   * sets the longest run outcome
   * @param newRunOutcome the new out of the longest run.
   *
   */ 
   public void setLongestOutcome(char newRunOutcome)
   {
      longestOutcome = newRunOutcome;
   }
     
   /**
   * computes the longest run
   *
   */ 
   public void computeLongestRun()
   {
      // declare variables
      int currentLength = 0;
      char currentOutcome = 'x';
      
      // for each toss in array tosses
      for(char toss : tosses)
      {
         // if the toss is equal to currentOutcome, iterate length, else reset
         if (toss == currentOutcome)
         {
            currentLength++;
            
            // if run is longer than longest, store in attribute
            if ( currentLength >= getLongestRun() )
            {
               setLongestRun(currentLength);
               setLongestOutcome(toss);
            }
         }
         else
         {
            currentOutcome = toss;
            currentLength = 1;
         } 
      }
   }
}