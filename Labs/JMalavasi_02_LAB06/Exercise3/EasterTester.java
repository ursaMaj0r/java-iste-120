import java.util.*;

/**
 * MonthTester - Class to test Easter
 * @author Malavasi
 * @version 20210308
*/
public class EasterTester
{
   public static void main(String[] args)
   {
      // declare variables
      int year;

      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // read in number
      System.out.print("Enter the year: " );
      year = in.nextInt(); in.nextLine();
      
      // instantiate Month
      Easter easter = new Easter(year);
      
      // Print output
      System.out.printf("Month: %d\n" , easter.getEasterSundayMonth());
      System.out.printf("Day: %d" , easter.getEasterSundayDay());
   }
}