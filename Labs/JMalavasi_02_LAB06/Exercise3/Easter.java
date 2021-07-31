/**
 * Easter - Class to calculate month and day 
 * of Easter for a given year. 
 *
 * @author JMalavasi
 * @version 20210308
*/
public class Easter
{
    // Declare Attributes
    private int year;
 
    /**
    * Constructs Easter with a given year
    * @param year the year to calculate
    */
   public Easter(int year) 
   {            
         this.year = year;
   }
   
   /**
    * Gets the month of Easter based on year.
    * @return month the month of Easter
    */
   public int getEasterSundayMonth() 
   {   
      // declare variables
      int month;
      int a = year % 19;
      int b = year / 100;
      int c = year % 100;
      int d = b / 4;
      int e = b % 4;
      int g = (8 * b + 13) / 25;
      int h = (19 * a + b - d - g + 15) % 30;
      int j = c / 4;
      int k = c % 4;
      int m = (a + 11 * h) / 319;
      int r = (2 * e + 2 * j - k - h + m + 32) % 7;
      int n = (h - m + r + 90) / 25;

      month = n;
      return month;
   }
   
   /**
    * Gets the day of Easter based on year.
    * @return day the day of Easter
    */
   public int getEasterSundayDay() 
   {   
      // declare variables
      int day;
      int a = year % 19;
      int b = year / 100;
      int c = year % 100;
      int d = b / 4;
      int e = b % 4;
      int g = (8 * b + 13) / 25;
      int h = (19 * a + b - d - g + 15) % 30;
      int j = c / 4;
      int k = c % 4;
      int m = (a + 11 * h) / 319;
      int r = (2 * e + 2 * j - k - h + m + 32) % 7;
      int n = (h - m + r + 90) / 25;
      int p = (h - m + r + n + 19) % 32;
   
      day = p;
      return day;
   }
   
  }