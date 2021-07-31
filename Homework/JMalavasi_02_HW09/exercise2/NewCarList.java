import java.util.*;

/*
* NewCarList - class to model list of cars
* @author Jeff Malavasi
* @version 20210411
*
*/

public class NewCarList
{
   static ArrayList<NewCar> carList = new ArrayList<NewCar>(); // list of cars
   
   /**
   * adds a car to the car list
   * @param newCar the car of to add to the list.
   *
   */ 
   public static void add(NewCar newCar)
   {
      carList.add(newCar);
   }
   
   /**
   * outputs car info
   * @return output information about the car.
   *
   */
   public static void display()
   {
      for(NewCar car : carList)
      {
         System.out.println(car.toString());
      }
   }

   /**
   * filters car info based on price
   * @param maxPrice the maximum price of the car
   * @return output information about cars under max price.
   *
   */
   public static void select(double maxPrice)
   {
      for(NewCar car : carList)
      {
         if ( car.getFinalPrice() < maxPrice )
         {
            System.out.println(car.toString());
         }
      }
   }       
   
   /**
   * removes a car from the car list
   * @param index the index of the car to remove from the list.
   *
   */ 
   public static void remove(int index)
   {
      carList.remove(index);
   }
}