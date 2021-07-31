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
      int credits = 0;
      
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // instantiate semester
      GPA semester = new GPA();
      
      // prompt for three courses
      for (int i = 0; i < 3; i++)
      {
         // prompt for grade
         System.out.print("Enter grade (one character): ");
         grade = in.next().charAt(0); in.nextLine();
         
         // prompt for credits
         System.out.print("Enter credits: ");
         credits = in.nextInt(); in.nextLine();
         
         // add to semester
         semester.addToTotals(grade,credits);
         
         //print sums
         System.out.printf("Sum Points: %d Sum Credits: %d\n", semester.getSumWeightedPoints(),semester.getSumCredits());
         
      }

      //output GPA
      System.out.printf("GPA: %.2f\n", semester.calcGPA());
   }
}