/*
* NewCar - class to model a car sale
* @author Jeff Malavasi
* @version 20210411
*
*/

public class NewCar
{
   private String make; // the make of the car
   private String model; // the make of the car
   private String year; // the year of the car
   private String abbr; // the abbreviation of the car
   private double stickerPrice; // the price of the car
   private double discount; // the discount on the purchase
   private double salesTaxRate; // the sales tax rate on the purchase
   private int numMonths; // the number of months in the loans
   private double finalPrice; // the final price of the car sale
      
    /**
    * Constructs Car with a year, make and model
    * @param year the year of the car
    * @param make the make of the car
    * @param model the model of the car
    */
   public NewCar(String year, String make, String model)
   {
      this.year = year;
      this.make = make;
      this.model = model;
      this.stickerPrice = 00.00;
      this.discount = 00.00;
      this.salesTaxRate = 00.00;
           
      //create abbreviation
      this.abbr = String.format("%s%s%s",year.substring((year.length()-2),year.length()),make.substring(0,1),model.substring(0,1));
   }
   
   /**
   * retrieves the final price
   * @return the current price of the car sale.
   *
   */ 
   public double getFinalPrice()
   {
      return finalPrice;
   }
    
   /**
   * toString - writes details about the current car to the stream
   * @return output string formatted by spec sheet.
   *
   */ 
   public String toString()
   {
      String output = String.format("You want to purchase a \"%s %s %s\" Abbreviation: \"%s\"\nFinal Price: %.2f", year, make, model, abbr,finalPrice); 
      return output;
   }
   
   /**
   * calcFinalPrice - calcuates the final price of the sale
   * @return price the cost of the sale.
   *
   */ 
   public Double calcFinalPrice(double stickerPrice, double discount, double salesTaxRate)
   {
      Double price = stickerPrice - discount + ((stickerPrice - discount)*(salesTaxRate/100));
      this.stickerPrice = stickerPrice;
      this.discount = discount;
      this.salesTaxRate = salesTaxRate;
      finalPrice = price;    
      return getFinalPrice();
   }
   
  /**
   * calcZeroPctMonPmt - calcuates the monthly payment
   * @return payment the cost of the sale per month.
   *
   */ 
   public Double calcZeroPctMonPmt(int numMonths)
   {
      Double payment = calcFinalPrice(this.stickerPrice,this.discount,this.salesTaxRate)/numMonths;  
      return payment;
   }    
}