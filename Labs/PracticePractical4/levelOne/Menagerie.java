import java.util.ArrayList; // import Array List

/**
 * test class for zoo proof of concept
 *
 * @author Malavasi
 * @class Practical4 2201
 * @version 20210504
*/
public class Menagerie
{
   public static void main(String[] args)
   {
      // Instantiate Animals in Zoo
      Tiger cub1 = new Tiger("Javan Tiger","Tiger Acreage #6");
      Tiger cub2 = new Tiger("Bengal Tiger","Ritchie Area of RIT");
      Tiger cub3 = new Tiger("Siberian Tiger","Tiger Acreage #4");
      Fish fish1 = new Fish("False Network Catfish","Fresh Water");
      Fish fish2 = new Fish("Shark","Salt Water");
      
      // Create ArrayList for Report
      ArrayList<Animal> animals = new ArrayList<Animal>();
      animals.add(cub1);
      animals.add(fish1);
      animals.add(cub2);
      animals.add(fish2);
      animals.add(cub3);
      
      // Create Report
      System.out.println("\nReport on animals...");
      int tigerCount = 0; // number of tigers at zoo
      int fishCount= 0; // number of fish at zoo
      
      // for each animal, print info
      for (Animal animal : animals)
      {
         if (animal instanceof Tiger)
         {
            System.out.printf("Tiger: %s\n", animal.toString());
            tigerCount++;
         }
         else if (animal instanceof Fish)
         {
            System.out.printf("Tiger: %s\n", animal.toString());
            fishCount++;         
         }
      }
      
      // print totals
      System.out.printf("\nCounts:\n \t%d Fish\n \t%d Tiger", fishCount, tigerCount);
   }

}