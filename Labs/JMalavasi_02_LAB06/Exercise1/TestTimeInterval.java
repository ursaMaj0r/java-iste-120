import java.util.*;

/**
 * TestTimeInterval - Class to test TimeInterval
 * @author Malavasi
 * @version 20210308
*/
public class TestTimeInterval
{
   public static void main(String[] args)
   {
      // declare variables
      int timeOne;
      int timeTwo;
      
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // Time Interval 1
      // read in times
      System.out.print("Please enter the first time: " );
      timeOne = in.nextInt(); in.nextLine();
      System.out.print("Please enter the second time: " );
      timeTwo = in.nextInt(); in.nextLine();
      
      // instantiate TimeInterval
      TimeInterval timeInterval = new TimeInterval(timeOne,timeTwo);
      
      System.out.printf("Elapsed time in hrs/min: %d hours %d minutes\n" , timeInterval.getHours(),timeInterval.getMinutes());
      System.out.printf("Elapsed time in decimal: %.2f hours" , timeInterval.getDecimalTime());
   }
}