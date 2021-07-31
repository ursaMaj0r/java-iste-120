import java.util.* ;
/**
 * Course: ISTE-120
 * Homework3 - A class to test the GregorianCalendar Class 
 * @author  J. Malavasi
 * @version 20210224
 */
public class Homework3 
{
	public static void main(String[] args) 
   {
      // instantiate GregorianCalendar to represent current datetime
      GregorianCalendar today = new GregorianCalendar();
      
      // instantiate GregorianCalendar to represent my birthday
      GregorianCalendar myBirthday = new GregorianCalendar(1995, Calendar.SEPTEMBER, 26);
      
      //print Current Date
      System.out.println("Today's date is " 
         + today.get(Calendar.MONTH) + "/" 
         + today.get(Calendar.DAY_OF_MONTH) + "/"
         + today.get(Calendar.YEAR));
         
      // Adds 100 days to day
      today.add(Calendar.DAY_OF_MONTH,100);
      
      //prints date in 100 days
      System.out.println("In 100 days, it will be " 
         + today.get(Calendar.MONTH) + "/" 
         + today.get(Calendar.DAY_OF_MONTH) + "/"
         + today.get(Calendar.YEAR));
         
      //prints birthday
      System.out.println("My birthday is " 
         + myBirthday.get(Calendar.MONTH) + "/" 
         + myBirthday.get(Calendar.DAY_OF_MONTH) + "/"
         + myBirthday.get(Calendar.YEAR));
         
      // Adds 10000 days to birthday
      myBirthday.add(Calendar.DAY_OF_MONTH,10000);
      
      //prints date in 100 days
      System.out.println("The date 10,000 days after my birthday is " 
         + myBirthday.get(Calendar.MONTH) + "/" 
         + myBirthday.get(Calendar.DAY_OF_MONTH) + "/"
         + myBirthday.get(Calendar.YEAR)
         + ", which is day " 
         + myBirthday.get(Calendar.DAY_OF_WEEK)
         + " of the week.");
	}
}