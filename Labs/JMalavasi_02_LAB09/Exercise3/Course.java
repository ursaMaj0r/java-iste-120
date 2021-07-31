/**
 * Course - Class to model a Course
 *
 * @author Malavasi
 * @version 20210403
*/
public class Course
{
   // Declare attributes
   private int credits; // number of credits for course
   private String grade; // grade for course
   
      /**
    * Parameterized Constructor
    * @param credits num of credits
    * @param grade letter grade for course
    */
   public Course(int credits, String grade)
   {
      // set course constraints
      this.credits = credits;
      this.grade = grade;
   }
   
  /**
   * retrieves the course grade
   * @return the current grade of the course.
   *
   */ 
   public String getGrade()
   {
      return grade;
   }
   
  /**
   * retrieves the course credits
   * @return the current credits of the course.
   *
   */ 
   public int getCredits()
   {
      return credits;
   }
}