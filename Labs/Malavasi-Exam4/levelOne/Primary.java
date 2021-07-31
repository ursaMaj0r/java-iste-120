/**
 * Primary - subclass of Member 
 *
 * @author Malavasi
 * @class Practical4 2205
 * @version 20210504
*/

public class Primary extends Member
{
   // declare attributes
   private double balance; // account balance in default account
   
   /**
   * Parameterized Constructor
   * @param id of member
   * @param name of member
   * @param defaultAccount default account type
   * @param balance
   */
   public Primary(int id, String name, int defaultAccount, double balance)
   {
      super(name, id, PRIMARY_MEMBER, defaultAccount);
      this.balance = balance;
   }

   /**
   * returns all primary member info
   * @return output primary member information.
   *
   */ 
   public String toString()
   {
      String output = String.format("Primary %s\nThe account balance is $%,.2f\n", super.toString(), balance);
      return output;
   }
}