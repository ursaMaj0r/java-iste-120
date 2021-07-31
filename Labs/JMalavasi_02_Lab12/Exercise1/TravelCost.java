/**
 * Interface to model travel costs
 *
 * @author Malavasi
 * @version 20210425
*/

public interface TravelCost
{
   //  declare constants
   public static final double AGENT_FEE = 10.00; // cost of using agent
   
   // declare methods
   public abstract double getDuration(); // returns trip length in hours
   public abstract double getTotalCost(); // returns trip cost in dollars
   public abstract double getLodgingCost(); // returns lodging cost in dollars
   public abstract String getDestination(); // returns destination
   public abstract String toString(); // returns formatted output
}