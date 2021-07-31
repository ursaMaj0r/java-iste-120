/**
 * Class to model Powerboat
 *
 * @author Malavasi
 * @version 20210418
*/

public class Powerboat extends Boat
{
   private int engineSize; // the size of the engine
   
   /**
   * Default Constructor
   *
   */
   public Powerboat()
   {
      super();
      engineSize = 5;
   }
   
   /**
   * Parameterized Constructor
   * @param color of the boat
   * @param length of the boat
   * @param engineSize number of sails 
   */
   public Powerboat(String color, int length, int engineSize)
   {
      super(color,length);
      this.engineSize = engineSize;
   }
   
   /**
   * retrieves the current number of sails
   * @return the current number of sails.
   *
   */ 
   public int getEngineSize()
   {
      return engineSize;
   }
     
   /**
   * sets the number of the sails
   * @param newEngineSize the new length of the boat.
   *
   */ 
   public boolean setEngineSize(int newEngineSize)
   {
      // validate input
      if (newEngineSize >= 5 && newEngineSize <= 350)
      {
         engineSize = newEngineSize;
         return true;
      }
      else 
      { 
         System.out.println("ERROR: Powerboats can only have between 1 & 4 sails, inclusively.");
         return false;
      }
   }
   
   /**
   * calculates the price of the powerboat
   * @return the cost of the sale
   */ 
   public double calcPrice()
   {
      return 5000 + (getLength() * 300) +(getEngineSize() * 20);
   }
   
   /**
   * retrieves powerboat information
   * @return the specs of the boat.
   *
   */ 
   public String toString()
   {
      return String.format("%s  Size of engine = %s  Price = $%,9.2f",super.toString(),getEngineSize(),calcPrice());
   }
}