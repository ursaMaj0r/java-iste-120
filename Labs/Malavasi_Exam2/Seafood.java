/**
 * Class to model Seafood Purchase
 *
 * @author Malavasi
 * @version 20210321
*/

public class Seafood
{
   private String seafoodType; // type of seafood
   private double weight; // the item's weight in ounces
   private double costPerPound; // the seafoodType's cost per pound
   private final double convertOuncesToPounds = 0.0625; // the conversion factor between ounces and pounds
   private final double markupFactor = 1.4; // the markup factor of the transcation (40%).
   private final double weightTolerance = 0.0001; // the tolerance for weight (distance from 0)
   
   /**
   * Default Constructor
   *
   */
   public Seafood()
   {
      seafoodType = "Unknown";
      weight = 0.0;
      costPerPound = 0.0;
   }
   
   /**
   * Parameterized Constructor
   * @param seafoodType type of seafood
   * @param weight item's weight in ounces
   * @param costPerPound the seafoodType's cost per pound
   */
   public Seafood(String seafoodType, double weight, double costPerPound)
   {
      this.seafoodType = seafoodType;
      this.weight = weight;
      this.costPerPound = costPerPound;
   }
   
   /**
   * retrieves the current seafoodType
   * @return the current type of the seafood.
   *
   */ 
   public String getSeafoodType()
   {
      return seafoodType;
   }
   
   /**
   * retrieves the current weight
   * @return the current weight of the seafood.
   *
   */ 
   public double getWeight()
   {
      return weight;
   }
   
   /**
   * retrieves the current cost per pound
   * @return the current cost per pound of the seafood type.
   *
   */ 
   public double getCostPerPound()
   {
      return costPerPound;
   }
   
   /**
   * sets the seafoodType
   * @param newSeafoodType the new type of seafood.
   *
   */ 
   public void setSeafoodType(String newSeafoodType)
   {
      seafoodType = newSeafoodType;
   }
   
   /**
   * sets the weight
   * @param newWeight the new weight of the seafood.
   *
   */ 
   public void setWeight(double newWeight)
   {
      weight = newWeight;
   }
   
   /**
   * sets the cost per pound
   * @param newCostPerPound the new weight of the seafood.
   *
   */ 
   public void setCostPerPound(double newCostPerPound)
   {
      costPerPound = newCostPerPound;
   }
   
   /**
   * calculates the selling price of the seafood transaction
   * @return the selling price of the seafood transaction.
   *
   */ 
   public double calcSellingPrice()
   {
      // calculate selling price
      double sellingPrice = (weight * convertOuncesToPounds) * costPerPound * markupFactor; 
      
      // if weight is 0 return -999, else selling price
      if (Math.abs(weight - 0.0) < weightTolerance)
      {
         return -999;
      }      
      else
      {
         return sellingPrice;
      }
   }
}