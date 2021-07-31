/**
 * Fish - subclass of animal 
 *
 * @author Malavasi
 * @class Practical4 2201
 * @version 20210504
*/

public class Fish extends Animal
{
   // declare attributes
   private String waterType; // type of water fish swims in
   
   /**
   * Parameterized Constructor
   * @param type of animal
   * @param waterType type of water fish swims in
   */
   public Fish(String type, String waterType)
   {
      super(type, FISH_PER_ENCLOSURE);
      this.waterType = waterType;
   }

   /**
   * returns all fish info
   * @return output fish information.
   *
   */ 
   public String toString()
   {
      String output = String.format("%s, swims in %s", super.toString(), waterType);
      return output;
   }
}