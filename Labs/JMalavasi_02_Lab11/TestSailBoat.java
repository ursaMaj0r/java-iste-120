
/**
 * TestSailBoat - Class to test SailBoat Class 
 *
 * @author Malavasi
 * @version 202100418
*/

public class TestSailBoat
{
   public static void main(String[] args)
   {
      System.out.println("Testing subclass Sailboat: ");
      
     //Instantiate and Print SailBoat info
     Sailboat boat1 = new Sailboat("red",25, 2);
     System.out.println(boat1.toString());
     
     // Set boat color to purple
     System.out.println("setting boat color to purple");
     boat1.setColor("purple");
     
     // Set boat color to purple
     System.out.println("setting boat color to purple");
     boat1.setColor("yellow");
     
     // Set boat length to 100
     System.out.println("setting boat length to 100");
     boat1.setLength(55);
     
     // Set boat length to 40
     System.out.println("setting boat length to 100");
     boat1.setLength(50);
      
     // print info
     System.out.println("Sailboat:");
     System.out.println(boat1.toString());
   }
}