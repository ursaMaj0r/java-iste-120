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
      String grade = "";
      int credits = 0;
      int numCourses = 0;
      boolean validInput = false;
      
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // instantiate semester
      GPA semester = new GPA();
      
      // prompt for number of courses
      while (!validInput)
      {
         System.out.print("Enter number of courses: ");
         numCourses = in.nextInt(); in.nextLine();
         
         // check for length greater than 0
         if (numCourses > 0)
         {
            validInput = true;
         }
         else
         {
            System.out.println("invalid number of courses - must be greater than 0.");
         }
      }    
      
      // prompt for grades
      for (int i = 0; i < numCourses; i++)
      {
         // prompt for grade
         validInput = false; // reset input validation          
         while (!validInput)
         {
            System.out.print("Enter grade (one character): ");
            grade = in.next(); in.nextLine();
            
            // check for valid characters
            if (grade.length() != 1 || GPA.calcPoints(grade.charAt(0)) == -1 )
            {
               System.out.println("invalid grade, please enter A-F or a-f");
            }
            else
            {
               validInput = true;
            }
         }
            
         //  prompt for credits
         validInput = false; // reset input validation
         while (!validInput)
         {
            System.out.print("Enter credits: ");
            credits = in.nextInt(); in.nextLine();
         
            // check for credits in range
            if (credits >= 0 && credits <= 9 )
            {
               validInput = true;
            }
            else
            {
               System.out.println("invalid number of credits,  must be between 0 and 9 inclusively.");
            }
         }
            
         // add to semester
         semester.addToTotals(grade.charAt(0),credits);
         
         //print sums
         System.out.printf("Sum Points: %d Sum Credits: %d\n", semester.getSumWeightedPoints(),semester.getSumCredits());
      }
      
         //output GPA
         System.out.printf("GPA: %.2f\n", semester.calcGPA());
   }
}