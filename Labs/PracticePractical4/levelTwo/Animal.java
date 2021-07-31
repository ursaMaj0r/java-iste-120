/**
 * class to implement animal enclosure
 *
 * @author Malavasi
 * @class Practical4 2201
 * @version 20210504
*/

public class Animal implements Enclosure
{
   // declare attributes
   private String type; // type of animal
   private int occupancy; // max number of animal type per enclosure

   /**
   * Default Constructor
   */
   public Animal()
   {
      type = "unknown";
      occupancy = DEFAULT_PER_ENCLOSURE;
   }
   
   /**
   * Parameterized Constructor
   * @param type of animal
   * @param occupancy max num of type per enclosure
   */
   public Animal(String type, int occupancy)
   {
      this.type = type;
      this.occupancy = occupancy;
   }

   /**
   * returns all animal info
   * @return output animal information.
   *
   */ 
   public String toString()
   {
      String output = String.format("Number of %s's per enclosure is %d", type, occupancy);
      return output;
   }
}