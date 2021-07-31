import java.util.*;

/**
 * GPA - Class to model student GPA
 *
 * @author Malavasi
 * @version 20210403
*/
public class GPA
{
   // Define Attributes
   private int[] credits; // array to store credits
   private String[] grades; // array to store grades
   private int numCourses; // number of courses
   private int maxCourses; // the maximum number of courses
   
   /**
    * Parameterized Constructor
    * @param maxCourses the maximum number of courses
    */
   public GPA(int maxCourses)
   {
      // set course constraints
      this.maxCourses = maxCourses;
      numCourses = 0;
      
      // allocate arrays
      credits = new int[maxCourses];
      grades = new String[maxCourses];
   }
   
  /**
   * Add the credits and grade to data arrays
   */ 
   public void addCourse(int credits, String grade)
   {
      // write to arrays
      this.credits[numCourses] = credits;
      grades[numCourses] = grade;
      
      // increment number of courses
      numCourses++;
   }
   
  /**
   * calculates the GPA of the student
   * @return the GPA.
   *
   */ 
   public double calcGPA()
   {
      int totalCredits = 0; // total number of credits
      int totalPoints = 0; // total number of points
      int points; // points for current course
      double gpa; // grade point average
      
      // calculate total number of credits
      for (int credit : credits)
      {
         totalCredits += credit;
      }
   
      // calculate total number of points
      for (int i = 0; i < numCourses; i++)
      {
         // convert from letter to integer
         switch (grades[i].charAt(0))
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
         
         // add to total points
         totalPoints += (points*credits[i]);
      }
      
      // calculate GAP
      gpa = (double) totalPoints/totalCredits;
      
      // return if valid, else return 0
      if (!Double.isNaN(gpa))
      {
         return gpa;
      }
      else
      {
         return 0.00;
      }
   }   
}