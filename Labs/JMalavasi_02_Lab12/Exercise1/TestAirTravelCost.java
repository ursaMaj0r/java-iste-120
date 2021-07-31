import java.util.*;
/**
 * TestAirTravelCost - Class to test AirTravelCost Class 
 *
 * @author Malavasi
 * @version 202100425
*/

public class TestAirTravelCost
{
   public static void main(String[] args)
   {
      if (args.length != 10)
      {
         System.out.println("ERROR: Invalid Number of command line arguments.");
         
      }
      else
      {
         // instantiate CarTravel, TrainTravel and AirTravel with args
         CarTravelCost trip1 = new CarTravelCost(Integer.parseInt(args[0]), Double.parseDouble(args[1]), args[2]);
         TrainTravelCost trip2 = new TrainTravelCost(Double.parseDouble(args[3]), Double.parseDouble(args[4]), args[2]);  
         AirTravelCost trip3 = new AirTravelCost(args[6],args[8],args[7],args[9],Double.parseDouble(args[5]),Double.parseDouble(args[1]), args[2]);  

        // output
        System.out.println(trip1.toString());
        System.out.println(trip2.toString());
        System.out.println(trip3.toString());
        
        // Create Array List
        ArrayList<TravelCost> trips = new ArrayList<TravelCost>();
        trips.add(trip1);
        trips.add(trip2);
        trips.add(trip3);
        
        // calculate lowest cost
        TravelCost lowestCostTrip = trip1;
        for (TravelCost trip : trips)
        {           
            if (trip.getTotalCost() < lowestCostTrip.getTotalCost())
            {
               lowestCostTrip = trip;
            }
        }
        System.out.printf("\nLOWEST COST: %s", lowestCostTrip.toString());
        
        
      // calculate shortest duration
        TravelCost shortestTrip = trip1;
        for (TravelCost trip : trips)
        {           
            if (trip.getDuration() < lowestCostTrip.getDuration())
            {
               shortestTrip = trip;
            }
        }
        System.out.printf("\nSHORTEST DURATION: %s\n", shortestTrip.toString());
      }
   }
}