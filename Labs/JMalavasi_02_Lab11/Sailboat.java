/**
 * Class to model Sailboat
 *
 * @author Malavasi
 * @version 20210418
*/

public class Sailboat extends Boat
{
   private int numSails; // the number of sails per boat
   
   /**
   * Default Constructor
   *
   */
   public Sailboat()
   {
      super();
      numSails = 1;
   }
   
   /**
   * Parameterized Constructor
   * @param color of the boat
   * @param length of the boat
   * @param numSails number of sails 
   */
   public Sailboat(String color, int length, int numSails)
   {
      super(color,length);
      this.numSails = numSails;
   }
   
   /**
   * retrieves the current number of sails
   * @return the current number of sails.
   *
   */ 
   public int getNumSails()
   {
      return numSails;
   }
     
   /**
   * sets the number of the sails
   * @param newNumSails the new length of the boat.
   *
   */ 
   public boolean setNumSails(int newNumSails)
   {
      // validate input
      if (newNumSails >= 1 && newNumSails <= 4)
      {
         numSails = newNumSails;
         return true;
      }
      else 
      { 
         System.out.println("ERROR: Sailboats can only have between 1 & 4 sails, inclusively.");
         return false;
      }
   }
   
   /**
   * calculates the price of the sailboat
   * @return the cost of the sale
   */ 
   public double calcPrice()
   {
      return (getLength() * 1000) + (getNumSails() * 2000);
   }
   
   /**
   * retrieves sailboat information
   * @return the specs of the boat.
   *
   */ 
   public String toString()
   {
      return String.format("%s  Number of sails = %s  Price = $%,9.2f",super.toString(),getNumSails(),calcPrice());
   }
}