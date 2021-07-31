
/**
 * TestPowerBoat - Class to test PowerBoat Class 
 *
 * @author Malavasi
 * @version 202100418
*/

public class TestPowerboat
{
   public static void main(String[] args)
   {
      System.out.println("Testing subclass Powerboat: ");
      
     //Instantiate and Print Powerboat info
     Powerboat boat1 = new Powerboat("yellow",20, 20);
     System.out.println(boat1.toString());
     
     // Set boat color to purple
     System.out.println("setting boat color to purple");
     boat1.setColor("purple");
     
     // Set boat color to purple
     System.out.println("setting boat color to purple");
     boat1.setColor("yellow");
     
     // Set boat length to 500
     System.out.println("setting boat length to 500");
     boat1.setEngineSize(500);
     
     // Set boat length to 350
     System.out.println("setting boat length to 350");
     boat1.setEngineSize(350);
      
     // print info
     System.out.println("PowerBoat:");
     System.out.println(boat1.toString());
   }
}