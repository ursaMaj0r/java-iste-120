import java.util.*;
/**
 * class to implement air travel costs
 *
 * @author Malavasi
 * @version 20210425
*/

public class AirTravelCost implements TravelCost
{
   // declare attributes
   private String departureDate, arrivalDate; // flight details YYYYMMDD
   private String departureTime, arrivalTime; // flight details HHMM
   private double travelFare, hotelCost; // cost of plane ticket and hotel cost per night
   private String destination; // name of trip destination
   
   /**
   * Parameterized Constructor
   * @param duration number of miles for trip
   * @param trainFare cost of train ticket
   * @param desination name of trip destination
   */
   public AirTravelCost(String departureDate, String arrivalDate, String departureTime, String arrivalTime, double travelFare, double hotelCost, String destination)
   {
      this.departureDate = departureDate;
      this.arrivalDate = arrivalDate;
      this.departureTime = departureTime;
      this.arrivalTime = arrivalTime;
      this.travelFare = travelFare;
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
   * @return the current trip duration in hours.
   *
   */ 
   public double getDuration()
   {
      // create two calendar objects
      GregorianCalendar departure = new GregorianCalendar(
         Integer.parseInt(departureDate.substring(0,4)), 
         Integer.parseInt(departureDate.substring(4,6)), 
         Integer.parseInt(departureDate.substring(6,8)), 
         Integer.parseInt(departureTime.substring(0,2)), 
         Integer.parseInt(departureTime.substring(2,4)));
      GregorianCalendar arrival = new GregorianCalendar(
         Integer.parseInt(arrivalDate.substring(0,4)), 
         Integer.parseInt(arrivalDate.substring(4,6)), 
         Integer.parseInt(arrivalDate.substring(6,8)), 
         Integer.parseInt(arrivalTime.substring(0,2)), 
         Integer.parseInt(arrivalTime.substring(2,4)));
      
      // calculate duration in milliseconds, then convert to hours
      double durationInMillis = arrival.getTimeInMillis() - departure.getTimeInMillis();
      return ((durationInMillis / 60000) / 60 );
   }

   /**
   * calculates the lodging cost
   * @return the total lodging cost.
   *
   */ 
   public double getLodgingCost()
   {
      // number of whole days times the nightly hotel cost
      return Math.floor(getDuration()/24) * hotelCost;
   }
   
   /**
   * calculates the total cost
   * @return the total trip cost.
   *
   */ 
   public double getTotalCost()
   {
      // calculate total cost
      return (travelFare + getLodgingCost() + AGENT_FEE);
   }
   
   /**
   * returns all trip info
   * @return the trip information.
   *
   */ 
   public String toString()
   {
      String output = String.format("Air travel to %s will take %.2f hours and cost $ %.2f", destination,getDuration(),getTotalCost());
      return output;
   }
}