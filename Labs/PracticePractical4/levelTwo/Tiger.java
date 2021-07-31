/**
 * Tiger - subclass of animal 
 *
 * @author Malavasi
 * @class Practical4 2201
 * @version 20210504
*/

public class Tiger extends Animal
{
   // declare attributes
   private String habitat; // where the animal lives
   
   /**
   * Parameterized Constructor
   * @param type of tiger
   * @param habitat where the animal lives
   */
   public Tiger(String type, String habitat)
   {
      super(type, TIGER_PER_ENCLOSURE);
      this.habitat = habitat;
   }

   /**
   * returns all tiger info
   * @return output tiger information.
   *
   */ 
   public String toString()
   {
      String output = String.format("%s, roams in %s", super.toString(), habitat);
      return output;
   }
}