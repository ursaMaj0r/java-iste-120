/**
 * TestCarTravel - Class to test CarTravelCost Class 
 *
 * @author Malavasi
 * @version 202100425
*/

public class TestCarTravel
{
   public static void main(String[] args)
   {
      if (args.length != 3)
      {
         System.out.println("ERROR: Invalid Number of command line arguments.");
         
      }
      else
      {
         // instantiate CarTravel with args
         CarTravelCost trip1 = new CarTravelCost(Integer.parseInt(args[0]), Double.parseDouble(args[1]), args[2]);
        
        // output
        System.out.println(trip1.toString());
      }
   }
}