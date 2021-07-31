import java.util.*; // import scanner class

/**
 * TestSeafood - Class to test Seafood Class 
 *
 * @author Malavasi
 * @version 20210321
*/

public class TestSeafood
{
   public static void main(String[] args)
   {
      //instantiate seafood1
      Seafood seafood1 = new Seafood();
      
      //print seafood1's information
      System.out.printf("Type: %s - Weight (oz): %.3f - Cost per pound $%.2f",seafood1.getSeafoodType(),seafood1.getWeight(),seafood1.getCostPerPound());
      System.out.printf("\nSelling Price: $%.2f\n",seafood1.calcSellingPrice());
      
      // set type, weight and cost per pound
      seafood1.setSeafoodType("Chilean Sea Bass");
      seafood1.setWeight(160.582);
      seafood1.setCostPerPound(33.57);
      
      //reprint seafood1's information
      System.out.printf("\nType: %s - Weight (oz): %.3f - Cost per pound $%.2f",seafood1.getSeafoodType(),seafood1.getWeight(),seafood1.getCostPerPound());
      System.out.printf("\nSelling Price: $%.2f\n",seafood1.calcSellingPrice());
      
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // prompt for input, seafoodType
      System.out.print("\nSeafood Type : ");
      String seafood2Type = in.nextLine();
      
      // prompt for input, weight
      System.out.print("\nWeight (oz) : ");
      double seafood2Weight = in.nextDouble(); in.nextLine();
      
      // prompt for input, costPerPound
      System.out.print("\nCost per pound ($) : ");
      double seafood2Cost = in.nextDouble(); in.nextLine();
      
      //instantiate seafood2
      Seafood seafood2 = new Seafood(seafood2Type, seafood2Weight, seafood2Cost);
      
      //print seafood2's information
      System.out.printf("Type: %s - Weight (oz): %.3f - Cost per pound $%.2f",seafood2.getSeafoodType(),seafood2.getWeight(),seafood2.getCostPerPound());
      System.out.printf("\nSelling Price: $%.2f\n",seafood2.calcSellingPrice());
   }
}