import java.util.*;
/**
 * ComputeGPA - Class to compute student GPA
 *
 * @author Malavasi
 * @version 20210320
*/
public class ComputeGPA
{
   public static void main(String[] args)
   {
      // declare variables
      char grade = 'x';
      
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      while (true)
      {
      // prompt for grade
         System.out.print("Enter grade (one character): ");
         grade = in.next().charAt(0); in.nextLine();
      
      //output points
         System.out.printf("Points: %.0f\n", GPA.calcPoints(grade));
      }
   }
}