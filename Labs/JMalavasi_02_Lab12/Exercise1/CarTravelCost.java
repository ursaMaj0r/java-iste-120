/**
 * class to implement car travel costs
 *
 * @author Malavasi
 * @version 20210425
*/

public class CarTravelCost implements TravelCost
{
   // declare attributes
   private int numMiles; // number of miles for trip
   private double hotelCost; // nightly cost of lodging
   private String destination; // name of trip destination
   
   /**
   * Parameterized Constructor
   * @param numMiles total trip distance
   * @param hotelCost cost of nightly lodging
   * @param desination name of trip destination
   */
   public CarTravelCost(int numMiles, double hotelCost, String destination)
   {
      this.numMiles = numMiles;
      this.hotelCost = hotelCost;
      this.destination = destination;
   }
   
   /**
   * retrieves the current destination
   * @return the current destination.
   *
   */ 
   public String getDestination()
   {
      return destination;
   }
   
   /**
   * calculates the duration
   * @return numHours the current trip duration in hours.
   *
   */ 
   public double getDuration()
   {
      // calculate number of hours based on average speed of 65 mph.
      double numHours = (double) numMiles / 65;
      return numHours;
   }

   /**
   * calculates the lodging cost
   * @return the total lodging cost.
   *
   */ 
   public double getLodgingCost()
   {
      // calculate lodging cost based on a max of 8 hours of driving per day.
      double numDays = Math.floor(getDuration()/8.0);
      return numDays * hotelCost;
   }
   
   /**
   * calculates the total cost
   * @return the total trip cost.
   *
   */ 
   public double getTotalCost()
   {
      // calculate number of hours based on mileage allowance, lodging and agent fee
      return ((numMiles * 0.45) + getLodgingCost() + AGENT_FEE);
   }
   
   /**
   * returns all trip info
   * @return the trip information.
   *
   */ 
   public String toString()
   {
      String output = String.format("Car travel to %s will take %.2f hours and cost $ %.2f", destination,getDuration(),getTotalCost());
      return output;
   }
}