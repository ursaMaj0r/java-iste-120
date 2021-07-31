/*
* Calculator - Lab 3
* @author Jeff Malavasi
* @version 2021.2.11
*
*/

public class Calculator
{
   private double accumulator; // the value of the calculator
      
   /*
      Default Constructor - Calculator
   */
   public Calculator()
   {
      accumulator = 0;
   }
   
   /**
   * getAccumulator - retrieve the current value of the accumulator
   * @return the current value of the accumulator.
   *
   */ 
   public double getAccumulator()
   {
      return accumulator;
   } 
   
   /**
   * toString - writes the accumulator to the stream as a string
   * @return the value in the accumulator.
   *
   */ 
   public String toString()
   {
      String output = "" + accumulator; 
      return output;
   } 
         
   /**
   * clearCalc - resets the accumulator to zero.
   * 
   *
   */   
   public void clear()
   {
      this.accumulator = 0;
   }
   
   /**
   * add - adds a number to the accumulator.
   * @param addends, the number to add to the accumulator
   *
   */   
   public void add(double addend)
   {
      this.accumulator += addend;
   }
   
   /**
   * subtract - subtracts a number from the accumulator.
   * @param Subtrahend, the number to subtract from the accumulator
   *
   */   
   public void subtract(double Subtrahend)
   {
      this.accumulator -= Subtrahend;
   }
   
   /**
   * multiply - multiplies the accumulator by a number.
   * @param factor, the number to multiply the accumulator by
   *
   */   
   public void multiply(double factor)
   {
      this.accumulator *= factor;
   }
   
   /**
   * divide - divide a number into the accumulator.
   * @param divisor, the number to divide into
   *
   */   
   public void divide(double divisor)
   {
      if (divisor == 0.0)
      {
         System.out.println("ATTEMPT TO DIVIDE BY ZERO - IGNORED");         
      }
      else
      {
         this.accumulator /= divisor;
      }
   }
}