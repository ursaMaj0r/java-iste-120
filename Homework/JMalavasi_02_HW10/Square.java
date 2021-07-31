import java.util.*;
/**
 * Class to model Squares
 *
 * @author Malavasi
 * @version 20210418
*/

public class Square
{
   private ArrayList<Integer> numbers; // array list to store integers
   private int[][] square; // 2d array to represent integers
   
   /**
   * Default Constructor
   *
   */
   public Square()
   {
      numbers = new ArrayList<Integer>();
   }
  
   /**
   * adds an integer to the arrayList
   * @param newInt the new integer
   *
   */ 
   public void add(int newInt)
   {
      numbers.add(newInt);
   }

   /**
   * checks if list is square
   *
   */ 
   public boolean isSquare()
   {
      boolean isSquare = false;
      if ( Math.sqrt(numbers.size()) - Math.floor(Math.sqrt(numbers.size())) == 0)
      {
         isSquare = true;
      }
      
      return isSquare;
   }
   
   /**
   * checks if list contains all numbers from  1 to n^2
   *
   */ 
   public boolean isUnique()
   {
      // count from 1 to n^2, if number is missing set isunique to false
      boolean isUnique = true;
      for (int i = 1; i <= numbers.size(); i++)
      {
         if (!(numbers.contains(i)))
         {
            isUnique = false;
         }
      }
      
      return isUnique;
   }
   
   /**
   * checks to see if set of integers forms a majic square
   *
   */ 
   public boolean isMagicSquare()
   {
      // declare attributes
      boolean isMagicSquare = true;
      square = new int[ (int) Math.sqrt(numbers.size())][ (int) Math.sqrt(numbers.size())];
      int diagSumLR = 0; // init diag sum LR
      int diagSumRL = 0; // init diag sum RL
      
      // load array
      int listNumber = 0;
      for (int row = 0; row < Math.sqrt(numbers.size()); row++) 
      {
         for (int col = 0; col < Math.sqrt(numbers.size()); col++) 
         {
            square[row][col] = numbers.get(listNumber);
            listNumber++;
         }
      }
      
      // check if diagonal sums match
      for (int row = 0; row < square.length; row++) // iterate through rows
      {
         diagSumLR += square[row][row];
      }
      for (int row = 0; row < square.length; row++) // iterate through rows
      {
         diagSumRL += square[row][(square.length - row - 1)];
      }      
      
      if (diagSumLR != diagSumRL)
      {
         isMagicSquare = false;
      }
      
      // check if each row matches the diagonal sum
      if (isMagicSquare)
      {
         int rowSum = 0;
      
         for (int row = 0; row < square.length; row++) // iterate through grid
         {
            rowSum = 0; // reset row sum
         
            for (int col = 0; col < square[row].length; col++) // sum each row
            {
               rowSum += square[row][col];
            }
         
            if (rowSum != diagSumRL)
            {
               isMagicSquare = false;
            }
         }
      }
      
      // check if each column matches the diagonal sum
      if (isMagicSquare)
      {
         int colSum = 0;
      
         for (int row = 0; row < square.length; row++) // iterate through grid
         {
            colSum = 0; // reset row sum
            
            for (int col = 0; col < square[row].length; col++) // sum each row
            {
               colSum += square[col][row];
            }
         
            if (colSum != diagSumRL)
            {
               isMagicSquare = false;
            }
         }
      }
      
      return isMagicSquare;
   }
}