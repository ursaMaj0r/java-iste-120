import java.util.*;

/**
 * GPA - Class to model student GPA
 *
 * @author Malavasi
 * @version 20210403
*/
public class GPA
{
   public static void main(String[] args)
   {
      // Define Attributes
      final int numCourses = 4; // constant for number of courses
      String[] grades = new String[numCourses]; // array to store grades
      int[] credits = new int[numCourses]; // array to store credits
      int totalCredits = 0; // total number of credits
      int totalPoints = 0; // total number of points
      double gpa; // grade point average
      
      // create scanner
      Scanner in = new Scanner(System.in);
      
      // prompt for grades & credits
      for (int i = 0; i < numCourses; i++)
      {      
         // prompt for credits and store in array
         System.out.printf("Enter credits for course %d: ", i+1);
         credits[i] = in.nextInt(); in.nextLine(); 
         
         // prompt for grade and store in array
         System.out.printf("Enter grade for course: %d: ", i+1);
         grades[i] = in.nextLine();
      }
         
      // calculate total number of credits
      for (int credit : credits)
      {
         totalCredits += credit;
      }
      
      // print total
      System.out.printf("\n\nTotal number of credits: %d\n", totalCredits);
      
      // calculate total number of points
      for (int i = 0; i < numCourses; i++)
      {
         totalPoints += ((intletterToNumeric(grades[i].charAt(0))*credits[i]));
      }
      
      // print total
      System.out.printf("Total number of points: %d\n", totalPoints);
      
      // print GPA
      if (totalCredits != 0)
      {
          gpa = (double) totalPoints/totalCredits;
      }
      else
      {
          gpa = 0.00;
      }
     
      System.out.printf("GPA: %4.2f\n ", gpa);
   }
   
   public static int intletterToNumeric(char letterGrade)
   {
      int points = 0; // delare return variable
      
      switch (letterGrade)
      {
         case 'a':
         case 'A':
            points = 4;
            break;
         case 'b':
         case 'B':
            points = 3;
            break;
         case 'c':
         case 'C':
            points = 2;
            break;
         case 'd':
         case 'D':
            points = 1;
            break;
         case 'f':
         case 'F':
            points = 0;
            break;
         default:
            points = 0;
            break;
      }      
      return points;
   }
}
// Arrays in Exercise 1
// credits:// [0]: __3___   [1]: __4___   [2]: __4___   [3]: ___3__//
// grades:// [0]: ___C__   [1]: __B___   [2]: __D___   [3]: ___A__//