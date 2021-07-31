/**
 * TimeInterval - Class to calculate interval between 
 * two times. 
 *
 * @author JMalavasi
 * @version 20210308
*/
public class TimeInterval
{
    // Declare Attributes
    private int timeOne;
    private int timeTwo;
 
    /**
    * Constructs a TimeInterval with two given times
    * @param timeOne the first time
    * @param timeTwo the second time
    */
   public TimeInterval(int timeOne, int timeTwo) 
   {  
      // declare variables
      boolean errors = false;
      
      //split into hours and minutes
      int timeOneHours = timeOne / 100;
      int timeOneMinutes = timeOne % 100;
      int timeTwoHours = timeTwo / 100;
      int timeTwoMinutes = timeTwo % 100;   
      
      // validate hours
      if ( (timeOneHours < 0 || timeTwoHours < 0) || ( (timeOneHours > 24 || timeTwoHours > 24) ) )
      {
         errors = true;
      }
      
      // validate minutes
      if ( (timeOneMinutes < 0 || timeTwoMinutes < 0) || ( (timeOneMinutes > 60 || timeTwoMinutes > 60) ) )
      {
         errors = true;
      }
            
      // create object if no errors
      if (errors)
      {
         System.out.println("Error - Invalid Input, pleaase try again.");
         System.exit(0);
      }
      else 
      {
         this.timeOne = timeOne;
         this.timeTwo = timeTwo;
      }  
   }
   
   /**
    * Gets the hours between two times.
    * @return hours the duration of hours
    */
   public int getHours() 
   {   
      int timeOneHours, timeOneMinutes, timeOnePastMidnight;
      int timeTwoHours, timeTwoMinutes,timeTwoPastMidnight;
      int hours;
      
      //split into hours and minutes
      timeOneHours = timeOne / 100;
      timeOneMinutes = timeOne % 100;
      timeTwoHours = timeTwo / 100;
      timeTwoMinutes = timeTwo % 100;
      
      //convert to minutes past midnight
      timeOnePastMidnight = (timeOneHours*60) + timeOneMinutes;
      timeTwoPastMidnight = (timeTwoHours*60) + timeTwoMinutes;
      
      // return abs difference
      hours = Math.abs(timeOnePastMidnight - timeTwoPastMidnight) / 60;
      
      return hours;
   }
   
   /**
    * Gets the minutes between two times.
    * @return minutes the duration of minutes
    */
   public int getMinutes() 
   {   
      int timeOneHours, timeOneMinutes, timeOnePastMidnight;
      int timeTwoHours, timeTwoMinutes,timeTwoPastMidnight;
      int minutes;
      
      //split into hours and minutes
      timeOneHours = timeOne / 100;
      timeOneMinutes = timeOne % 100;
      timeTwoHours = timeTwo / 100;
      timeTwoMinutes = timeTwo % 100;
      
      //convert to minutes past midnight
      timeOnePastMidnight = (timeOneHours*60) + timeOneMinutes;
      timeTwoPastMidnight = (timeTwoHours*60) + timeTwoMinutes;
      
      // return abs difference
      minutes = Math.abs(timeOnePastMidnight - timeTwoPastMidnight) % 60;
      
      return minutes;
   }
   
   /**
    * Gets the duration between two times in double format.
    * @return duration the duration of time
    */
   public double getDecimalTime() 
   {   
      double duration = getHours() + ( getMinutes() / 60.00 );
      
      return duration;
   }
}