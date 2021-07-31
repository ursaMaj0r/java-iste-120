/**
 * TestTrainTravelCost - Class to test TrainTravelCost Class 
 *
 * @author Malavasi
 * @version 202100425
*/

public class TestTrainTravelCost
{
   public static void main(String[] args)
   {
      if (args.length != 5)
      {
         System.out.println("ERROR: Invalid Number of command line arguments.");
         
      }
      else
      {
         // instantiate CarTravel and TrainTravel with args
         CarTravelCost trip1 = new CarTravelCost(Integer.parseInt(args[0]), Double.parseDouble(args[1]), args[2]);
         TrainTravelCost trip2 = new TrainTravelCost(Double.parseDouble(args[3]), Double.parseDouble(args[4]), args[2]);  
        
        // output
        System.out.println(trip1.toString());
        System.out.println(trip2.toString());
      }
   }
}