public class TestCalc1
{  
   public static void main(String[] args)
   {
      // Declare Calculator
      Calculator myCalc = new Calculator();
      System.out.println("Initializing calc - " + myCalc.getAccumulator());
      
      //Test add
      myCalc.add(25);
      System.out.println("Adding 25 - " + myCalc.getAccumulator());
      
      //Test subtract
      myCalc.subtract(5);
      System.out.println("Subtracting 5 - " + myCalc.getAccumulator());
      
      //Test multiply
      myCalc.multiply(2);
      System.out.println("Multiplying by 2 - " + myCalc.getAccumulator());
      
      //Test divide
      myCalc.divide(10);
      System.out.println("Dividing by 10 - " + myCalc.getAccumulator());
      
      //Test divide by zero
      System.out.println("Dividing by 0");
      myCalc.divide(0);
      
      // Test toString
      System.out.println("STRING - " + myCalc.toString());
            
      // Test Clear
      myCalc.clear();
      System.out.println("Clearing calc - " + myCalc.getAccumulator());
            
      // run weight test from exercise 1
      double myWeight = 140;
      myCalc.add(myWeight);
      myCalc.multiply(0.453952); 
      System.out.println("My weight is " + myWeight + "lb = " + myCalc.getAccumulator() + "kg");
      
      // run pi approximation test from exercise 1
      myCalc.clear();
      myCalc.add(22);
      myCalc.divide(7);
      System.out.println("Pi Approximation- " + myCalc.getAccumulator());
      
      // run NYC population test from exercise 1
      double population = 19400000; // population of New York
      double area = 47126; // area of New York in sq miles
      myCalc.clear();
      myCalc.add(population);
      myCalc.divide(area);
      System.out.println("Population Density of NY - " + myCalc.getAccumulator() + " people/square mile"); 
   }
}