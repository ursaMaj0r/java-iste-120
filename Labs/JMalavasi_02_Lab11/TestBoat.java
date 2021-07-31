
/**
 * TestBoat - Class to test Boat Class 
 *
 * @author Malavasi
 * @version 202100418
*/

public class TestBoat
{
   public static void main(String[] args)
   {
      System.out.println("Testing Superclass Boat: ");
      
     //Instantiate and Print Boat info
     Boat boat1 = new Boat("blue",25);
     System.out.println(boat1.toString());
     
     // Set boat length to 100
     System.out.println("setting boat length to 100");
     boat1.setLength(100);
     
      // Set boat length to 40
     System.out.println("setting boat length to 100");
     boat1.setLength(40);
      
     // Set boat color to purple
     System.out.println("setting boat color to purple");
     boat1.setColor("purple");
     
     // Set boat color to red
     System.out.println("setting boat color to red");
     boat1.setColor("red");
     
     // print info
     System.out.println(boat1.toString());
   }
}