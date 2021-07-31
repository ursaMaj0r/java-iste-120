import java.util.*;
/**
 * Inventory - Class to test All Boat Classes 
 *
 * @author Malavasi
 * @version 202100418
*/

public class Inventory
{
   public static void main(String[] args)
   {
      System.out.println("Printing All Boats: \n");
      
     //Instantiate array list
     ArrayList<Boat> inventory = new ArrayList<Boat>();
     
     // Instantiate Boats
     Powerboat boat1 = new Powerboat("blue",22, 60);
     Sailboat boat2 = new Sailboat("white",20, 1);
     Sailboat boat3 = new Sailboat("red",42, 3);
     Powerboat boat4 = new Powerboat("yellow",35, 80);
     Powerboat boat5 = new Powerboat("red",50, 120);
     Sailboat boat6 = new Sailboat("blue",33, 2);
     Powerboat boat7 = new Powerboat("white",20, 10);
     
     // Add Boats to collection
     inventory.add(boat1);
     inventory.add(boat2);
     inventory.add(boat3);
     inventory.add(boat4);
     inventory.add(boat5);
     inventory.add(boat6);
     inventory.add(boat7);
     
     // print info and collect inventory info
     double totalPrice = 0.0;
     for (Boat boat : inventory)
     {
         System.out.println(boat.toString());
         if (boat instanceof Sailboat)
         {
            totalPrice += ((Sailboat) boat).calcPrice();
         }
         else if (boat instanceof Powerboat)
         {
            totalPrice += ((Powerboat) boat).calcPrice();
         }
     }
     
     // Print Total Cost
     System.out.printf("\nTotal Price of all boats is $%,9.2f\n",totalPrice);
     
     // Print Most Expensive
     Boat mostExpensiveBoat = new Boat();
     double mostExpensiveSale = 0.0;
     for (Boat boat : inventory)
     {
         if (boat instanceof Sailboat)
         {
            if (((Sailboat) boat).calcPrice() >= mostExpensiveSale)
            {
               mostExpensiveBoat = boat;
               mostExpensiveSale = ((Sailboat) boat).calcPrice();
            }
         }
         else if (boat instanceof Powerboat)
         {
            if (((Powerboat)boat).calcPrice() >= mostExpensiveSale)
            {
               mostExpensiveBoat = boat;
               mostExpensiveSale = ((Powerboat) boat).calcPrice();
            }
         }
     }
     
     // Print Total Cost
     System.out.printf("\nMost Expensive Boat: %s\n",mostExpensiveBoat.toString());
   }
}