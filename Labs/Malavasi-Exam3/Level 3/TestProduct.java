import java.util.*; // import scanner class

/**
 * TestCourse - Class to test Product Class 
 *
 * @author Malavasi
 * @version 202100417
*/

public class TestProduct
{
   public static void main(String[] args)
   {
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // prompt for product code
      System.out.print("Product Code: ");
      String productCode = in.nextLine();
      while ( !(productCode.equals("IPAD") || productCode.equals("XBOX") || productCode.equals("ROTR") ) )
      {
          // Print Error
         System.out.println("The type must be \"IPAD\", \"XBOX\", or \"ROTR\".");
         
         // Reprompt   
         System.out.print("Product Code: ");
         productCode = in.nextLine();
      }
      
      // prompt for assembly number
      System.out.print("Assembly Number: ");
      int assemblyNumber = in.nextInt(); in.nextLine(); // clear line
      while (!(assemblyNumber >= 1 && assemblyNumber <= 9999999))
      {
          // Print Error
         System.out.println("The assembly number must be between 1 and 9999999 (inclusive).");
         
         // Reprompt   
         System.out.print("Assembly Number: ");
         assemblyNumber = in.nextInt(); in.nextLine(); // clear line
      }
           
      // prompt for part ID
      System.out.print("Part ID: ");
      String partID = in.nextLine();
      while (partID.length() != 4)
      {
          // Print Error
         System.out.println("The part ID must be 4 characters long.");
         
         // Reprompt   
         System.out.print("Part ID: ");
         partID = in.nextLine();
      }
      
      //Instantiates Product1
      Product product1 = new Product(productCode, partID, assemblyNumber);
      
      // prompt for location code
      System.out.print("Location Code: ");
      int locationCode = in.nextInt(); in.nextLine(); // clear line
      while (!(locationCode >= 1 && locationCode <= 54))
      {
          // Print Error
         System.out.println("The location code must be between 1 and 54 (inclusive).");
         
         // Reprompt   
         System.out.print("Location Code: ");
         locationCode = in.nextInt(); in.nextLine(); // clear line
      }
      
      //Set Location Code Value
      product1.setLocationCode(locationCode);
      
      // Print Product Info
      System.out.printf("%s:%07d:%s was produced in location %d\n", product1.getProductCode(),product1.getAssemblyNumber(),product1.getPartID(),product1.getLocationCode());
   
      //Instantiates Product2
      Product product2 = new Product("XBOX:0000310:5G4U");
      
      //Set Location Code Value
      product2.setLocationCode(5);
      
      // Print Product Info
      System.out.printf("product2 using accesors - %s:%07d:%s was produced in location %d\n", product2.getProductCode(),product2.getAssemblyNumber(),product2.getPartID(),product2.getLocationCode());
      System.out.printf("product2 id using virtual accesor - %s\n", product2.getProductPart());
      
      // Set infoSize
      int infoSize = 5; 
   
      // Instantiate Product3
      Product product3 = new Product("IPAD:0012345:P1W5",infoSize);
      
      //Set Location Code Value
      product3.setLocationCode(3);
      
      // Prompt for additonal info
      System.out.println("Enter additonal information items for product3");
      for (int i = 1; i <= product3.getInfoSize(); i++)
      {
         System.out.println("Enter one line of information:");
         product3.setInfoItem(i-1, in.nextLine());
      }
      
      // Print Product Info
      System.out.printf("product3 using accesors - %s:%07d:%s was produced in location %d\n", product2.getProductCode(),product2.getAssemblyNumber(),product2.getPartID(),product2.getLocationCode());
      System.out.printf("product3 id using virtual accesor - %s\nproduct info:\n", product2.getProductPart());
      for (int i = 0; i < product3.getInfoSize(); i++)
      {
         System.out.println("     " + product3.getInfoItem(i));
      }
   }
}