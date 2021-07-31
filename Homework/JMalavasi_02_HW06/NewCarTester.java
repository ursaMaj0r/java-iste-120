import java.util.*;

/**
 * NewCarTester - Class to test NewCar
 * @author Malavasi
 * @version 20210308
*/
public class NewCarTester
{
   public static void main(String[] args)
   {
      // declare variables
      String carInfo;
      double stickerPrice;
      double discount;
      double salesTaxRate;
      int numMonths;

      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // read in car info
      System.out.print("Enter the car\'s Year, Make and Model: ");
      carInfo = in.nextLine();
      
      // read in sales info
      System.out.print("Enter the sticker price: ");
      stickerPrice = in.nextDouble(); in.nextLine();
      System.out.print("Enter the discount: ");
      discount = in.nextDouble(); in.nextLine();
      System.out.print("Enter the Sales tax rate: ");
      salesTaxRate = in.nextDouble(); in.nextLine();
      System.out.print("Enter the number of months at zero percent interest: ");
      numMonths = in.nextInt(); in.nextLine();
            
      // instantiate newCar
      NewCar car = new NewCar(carInfo.split(" ")[0],carInfo.split(" ")[1],carInfo.split(" ")[2]);
      
      // Print output
      System.out.println(car.toString());
      System.out.printf("Final Price: %.2f\n", car.calcFinalPrice(stickerPrice,discount,salesTaxRate));
      System.out.printf("Monthly Payment at zero percent: %.2f", car.calcZeroPctMonPmt(numMonths));
   }
}
