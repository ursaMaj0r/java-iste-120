/**
 * Month - Class to calculate month name from 
 * month number. 
 *
 * @author JMalavasi
 * @version 20210308
*/
public class Month
{
    // Declare Attributes
    private int monthNumber;
 
    /**
    * Constructs a Month with a given number
    * @param monthNumber the number of the month
    */
   public Month(int monthNumber) 
   {                 
      this.monthNumber = monthNumber;
   }
   
   /**
    * Gets the name of the month based on number.
    * @return monthName the name of the month
    */
   public String getName() 
   {   
      // declare variables
      String Months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
      int start = (monthNumber - 1) * 9;
      int end = monthNumber * 9;
      String monthName = Months.substring(start,end);
      return monthName;
   }
   
  }