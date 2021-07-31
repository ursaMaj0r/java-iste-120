import java.util.*;

/**
 * MonthTester - Class to test Month
 * @author Malavasi
 * @version 20210308
*/
public class MonthTester
{
   public static void main(String[] args)
   {
      // declare variables
      int monthNumber;

      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // read in number
      System.out.print("Enter the Month Number: " );
      monthNumber = in.nextInt(); in.nextLine();
      
      // instantiate Month
      Month month = new Month(monthNumber);
      
      // Print output
      System.out.printf("The month is: %s" , month.getName());
   }
}

/* LAB QUESTIONS
   If you enter a 0 or a 13, an error is thrown. This is because the request for a substring
   is out of range of the String which is really an array of characters.
*/