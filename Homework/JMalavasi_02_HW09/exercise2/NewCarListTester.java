/*
* NewCarListTester - class to model list of cars
* @author Jeff Malavasi
* @version 20210411
*
*/

public class NewCarListTester
{
   public static void main(String[] args)
   {
      // instantiate cars
      NewCar car1 = new NewCar("2020", "Kia", "Rio");
      NewCar car2 = new NewCar("2017", "Kia", "Rio");
      NewCar car3 = new NewCar("2014", "Honda", "Civic");
      NewCar car4 = new NewCar("2020", "Honda", "Civic");
      NewCar car5 = new NewCar("2010", "Chevrolet", "Cobalt");
      NewCar car6 = new NewCar("2010", "Honda", "Accord");
      NewCar car7 = new NewCar("2019", "Subaru", "Forester");
      NewCar car8 = new NewCar("2020", "Chevrolet", "Malibu");
      
      //Add Sales information
      car1.calcFinalPrice(17455,1265,8);
      car2.calcFinalPrice(10990,0,8);
      car3.calcFinalPrice(13590,0,8);
      car4.calcFinalPrice(21755,1000,8);
      car5.calcFinalPrice(6995,0,8);
      car6.calcFinalPrice(10990,0,8);
      car7.calcFinalPrice(22590,0,8);
      car8.calcFinalPrice(24195,3533,8);
      
      // add 5 cars
      NewCarList.add(car1);
      NewCarList.add(car2);
      NewCarList.add(car3);
      NewCarList.add(car4);
      NewCarList.add(car5);
      
      // display list
      System.out.println("*** List of cars");
      NewCarList.display();
      
      // display list under $14500
      System.out.println("\n*** List of cars under $14500");
      NewCarList.select(14500);
      
      // add 3 more cars
      NewCarList.add(car6);
      NewCarList.add(car7);
      NewCarList.add(car8);
      
      // display list
      System.out.println("\n*** Add 3 more cars and list");
      NewCarList.display();
      
      // delete 3rd item
      NewCarList.remove(2);
      
      // display list
      System.out.println("\n*** Delete the third item in the list");
      NewCarList.display();
   }
}