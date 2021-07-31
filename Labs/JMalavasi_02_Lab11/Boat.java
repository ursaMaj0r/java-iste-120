/**
 * Class to model Boat
 *
 * @author Malavasi
 * @version 20210418
*/

public class Boat
{
   private String color; // boat color
   private int length; // length of boat
   
   /**
   * Default Constructor
   *
   */
   public Boat()
   {
      color = "white";
      length = 20;
   }
   
   /**
   * Parameterized Constructor
   * @param color of the boat
   * @param length of the boat
   */
   public Boat(String color, int length)
   {
      setColor(color);
      setLength(length);
   }

   /**
   * retrieves the current color
   * @return the current color.
   *
   */ 
   public String getColor()
   {
      return color;
   }
   
   /**
   * sets the color
   * @param newColor the new color of the boat.
   *
   */ 
   public boolean setColor(String newColor)
   {
      // validate input
      if (newColor.equals("white") || newColor.equals("red") || newColor.equals("blue") || newColor.equals("yellow"))
      {
         color = newColor;
         return true;
      }
      else
      { 
         System.out.println("ERROR: boats can only be white, red, blue, or yellow.");
         return false;
      }
   }
         
   /**
   * retrieves the current length
   * @return the current length.
   *
   */ 
   public int getLength()
   {
      return length;
   }
   
     
   /**
   * sets the length of the boat
   * @param newLength the new length of the boat.
   *
   */ 
   public boolean setLength(int newLength)
   {
      // validate input
      if (newLength >= 20 && newLength <= 50)
      {
         length = newLength;
         return true;
      }
      else 
      { 
         System.out.println("ERROR: Boats can only be between 20 & 50 feet, inclusively.");
         return false;
      }
   }
    
   /**
   * retrieves boat information
   * @return the specs of the boat.
   *
   */ 
   public String toString()
   {
      return String.format("Color = %s   Length = %d",getColor(),getLength());
   }
}