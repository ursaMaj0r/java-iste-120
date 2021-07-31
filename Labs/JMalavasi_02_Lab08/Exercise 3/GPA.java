/**
 * GPA - Class to model student GPA
 *
 * @author Malavasi
 * @version 20210320
*/
public class GPA
{
   private int sumCredits; // total amount of credits
   private int sumWeightedPoints; //total number of weighted points

   /**
    * Default Constructor
    */
   public GPA()
   {
      sumCredits = 0;
      sumWeightedPoints = 0;
   }

 /**
   * retrieve the current total amount of credits
   * @return total amount of credits.
   *
   */ 
   public int getSumCredits()
   {
      return sumCredits;
   } 
   
   /**
   * retrieve the current total number of weighted points
   * @return total number of weighted points.
   *
   */ 
   public int getSumWeightedPoints()
   {
      return sumWeightedPoints;
   }

   /**
   * calculates the points from letter grade
   * @return points for the grade
   *
   */ 
   public static double calcPoints(char letterGrade)
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
            points = -1;
            break;
      }
      
      return points;
   }  
   
   /**
   * Add the credits to the sum of credits
   */ 
   public void addToTotals(char letterGrade, int numCredits)
   {
      sumCredits += numCredits;
      sumWeightedPoints += (calcPoints(letterGrade)*numCredits);
   }
   
      
   /**
   * calculates the GPA of the student
   * @return the GPA.
   *
   */ 
   public double calcGPA()
   {
      double GPA = (double) sumWeightedPoints/sumCredits; 
      return GPA;
   }       
}