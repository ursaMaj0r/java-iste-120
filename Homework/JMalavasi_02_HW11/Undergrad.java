/**
 * Class to extend Student - Undergrad
 *
 * @author Malavasi
 * @version 20210425
*/

public class Undergrad extends Student
{
   // declare attributes
   private int yearLevel; // grade
   
   /**
   * Parameterized Constructor
   * @param name student name
   * @param id student id 
   * @param numCredits total number of credits
   * @param yearLevel grade of student
   */
   public Undergrad(String name, String id, int numCredits, int yearLevel)
   {
      super(name,id,numCredits);
      setYearLevel(yearLevel);
   }
   
   /**
   * retrieves the current year level
   * @return the current grade.
   *
   */ 
   public int getYearLevel()
   {
      return yearLevel;
   }
     
   /**
   * sets the yearLevel
   * @param newYearLevel the new grade.
   *
   */ 
   public void setYearLevel(int newYearLevel)
   {
      yearLevel = newYearLevel;
   }
   
   /**
   * calculates the tuition cost
   * @return the cost of tuition
   */ 
   public double calcTuition()
   {
      final int creditHourCost = 517;
      return getNumCredits() * creditHourCost;
   }
   
   /**
   * prints out student information
   *
   */ 
   public String toString()
   {
      return String.format("\tName:\t %s\n\tId:\t %s\n\tCredits:\t %d\n\tYear Level:\t %d\n\tTuition:\t $%.2f\n",getName(),getId(),getNumCredits(),getYearLevel(),calcTuition());
   }
}