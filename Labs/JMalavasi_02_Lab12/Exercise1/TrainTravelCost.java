/**
 * class to implement train travel costs
 *
 * @author Malavasi
 * @version 20210425
*/

public class TrainTravelCost implements TravelCost
{
   // declare attributes
   private double duration; // number of miles for trip
   private double travelFare; // cost of train ticket
   private String destination; // name of trip destination
   
   /**
   * Parameterized Constructor
   * @param duration number of miles for trip
   * @param trainFare cost of train ticket
   * @param desination name of trip destination
   */
   public TrainTravelCost(double duration, double travelFare, String destination)
   {
      this.duration = duration;
      this.travelFare = travelFare;
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
   * @return the current trip duration in hours.
   *
   */ 
   public double getDuration()
   {
      return duration;
   }

   /**
   * calculates the lodging cost
   * @return the total lodging cost.
   *
   */ 
   public double getLodgingCost()
   {
      // lodging is included for free.
      return 0.0;
   }
   
   /**
   * calculates the total cost
   * @return the total trip cost.
   *
   */ 
   public double getTotalCost()
   {
      // calculate total cost
      return (travelFare + AGENT_FEE);
   }
   
   /**
   * returns all trip info
   * @return the trip information.
   *
   */ 
   public String toString()
   {
      String output = String.format("Train travel to %s will take %.2f hours and cost $ %.2f", destination,getDuration(),getTotalCost());
      return output;
   }
}