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
   ArrayList<Course> courseInfo = new ArrayList<Course>(); // array to store course info
   int numCourses; // number of courses
   int maxCourses; // the maximum number of courses
   
   /**
    * Parameterized Constructor
    * @param the maximum number of courses
    */
   public GPA(int maxCourses)
   {
      // set course constraints
      this.maxCourses = maxCourses;
   }
   
  /**
   * Add the credits and grade to data arrays
   */ 
   public void addCourse(int credits, String grade)
   {
      // write to arrays
      courseInfo.add(new Course(credits,grade));
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
        
      // foreach course, calculate weighted points
      for (Course course : courseInfo)
      {
         // calculate total number of credits
         totalCredits += course.getCredits();
      
         // convert from letter to integer
         switch (course.getGrade().charAt(0))
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
         totalPoints += (points*course.getCredits());
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

// ArrayListin sample #2 in Exercise 2
// 
// [0]: __{4,B}___   [1]: __{3,C}___   [2]: __{3,D}___   [3]: __{2,F}___
//