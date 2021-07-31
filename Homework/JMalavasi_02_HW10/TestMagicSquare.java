import java.util.*;
/**
 * TestMagicSquare - Class to test Square Class 
 *
 * @author Malavasi
 * @version 202100418
*/

public class TestMagicSquare
{
   public static void main(String[] args)
   {
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // instantiate square
      Square square1 = new Square();
        
      // prompt for course number
      System.out.print("Enter an integer (x to exit): ");
      String input = in.nextLine();
      while ( !(input.equals("x")) )
      {
         try 
         {
            // add to numbers list
            square1.add(Integer.parseInt(input));
         }
         catch (NumberFormatException nfe)
         { 
            // Print Error
            System.out.println("***invalid data entry***");
         }
                             
         // Reprompt   
         System.out.print("Enter an integer (x to exit): ");
         input = in.nextLine();
      }
      
      // Run Tests
      
      // check if square
      if (square1.isSquare())
      {
         System.out.println("Step 1. Numbers form a square");
      }
      else
      {
         System.out.println("Step 1. Numbers do not form a square: Program Stopped.");
      }
      
      // check if unique
      if (square1.isUnique())
      {
         System.out.println("Step 2. Numbers are unique");
      }
      else
      {
         System.out.println("Step 2. Numbers are not unique: Program Stopped.");
      }
      
      // check if magic square
      if (square1.isMagicSquare())
      {
         System.out.println("Step 3. Yes, it is a MAGIC SQUARE!");
      }
      else
      {
         System.out.println("Step 3. But it is NOT a magic square.");
      }
   }
}