public class CalcBMI
{  
   public static void main(String[] args)
   {
      // Declare Variables
      double height = 72; // height in inches
      double weight = 140; // weight in lbs
      
      // declare calculators
      Calculator numerator = new Calculator();
      Calculator denominator = new Calculator();
      
      //calculate BMI
      numerator.add(weight);
      numerator.multiply(703);    
      denominator.add(height);
      denominator.multiply(height);
      numerator.divide(denominator.getAccumulator());
      
      //output to screen
      System.out.println("BMI for Height:" + height + "," + "Weight:" + weight + "=" + numerator.toString());
   }
}