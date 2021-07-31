/**
 * GPA - Class to model student GPA
 *
 * @author Malavasi
 * @version 20210320
*/
public class GPA
{
   /**
   * calcPoints - calculates the points from letter grade
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
}