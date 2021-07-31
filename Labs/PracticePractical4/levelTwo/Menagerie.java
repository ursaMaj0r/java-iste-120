import java.util.ArrayList; // import Array List
import java.io.*; // for all the IO classes

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
      
      try
      {
         // Define Output file
         final String outputFileName = "Menagerie.txt";
         File outputFile = new File(outputFileName);
         PrintWriter output;
      
          // If output file exists, append else create output file
         if (outputFile.exists())
         {
            System.out.printf("Adding to the current file %s", outputFileName);
            output = new PrintWriter(new FileWriter(new File(outputFile.getName()),true));
         }
         else
         {
            System.out.printf("Creating a new file %s", outputFileName);
            output = new PrintWriter(new FileWriter(new File(outputFile.getName())));
         }
      
         // Create Report
         output.println("\nReport on animals...");
         int tigerCount = 0; // number of tigers at zoo
         int fishCount= 0; // number of fish at zoo
      
         // for each animal, print info
         for (Animal animal : animals)
         {
            if (animal instanceof Tiger)
            {
               output.printf("Tiger: %s\n", animal.toString());
               tigerCount++;
            }
            else if (animal instanceof Fish)
            {
               output.printf("Tiger: %s\n", animal.toString());
               fishCount++;         
            }
         }
      
         // print totals
         output.printf("\nCounts:\n \t%d Fish\n \t%d Tiger\n", fishCount, tigerCount);
      
         // close output stream
         output.close();
      }
      catch (IOException ioe)
      {
         System.out.println("ERROR: " + ioe);
         System.exit(1);
      }
   }

}