/**
 * BankAccount - Class to model a bank account, which has a balance that 
 * can be changed by deposits and withdrawals.
 *
 * @author Malavasi
 * @version 20210228
*/

public class BankAccount 
{ 

   // Declare Attributes
   private double balance;
   private int transFee;

   /**
    * Constructs a bank account with a zero balance
    */
   public BankAccount() 
   {   
      balance = 0;
   }

   /**
    * Constructs a bank account with a given balance
    * @param initialBalance the initial balance
    */
   public BankAccount(double initialBalance) 
   {   
      balance = initialBalance;
   }

   /**
    * Deposits money into the bank account.
    * @param amount the amount to deposit
    */
   public void deposit(double amount) 
   {  
      double newBalance = balance + amount;
      balance = newBalance - transFee;
   }

   /**
    * Withdraws money from the bank account.
    * @param amount the amount to withdraw
    */
   public void withdraw(double amount) 
   {   
      double newBalance = balance - amount;
      balance = newBalance - transFee;
   }

   /**
    * Gets the current balance of the bank account.
    * @return the current balance
    */
   public double getBalance() 
   {   
      return balance;
   }
   
   /**
    * Gets the transaction fee.
    * @return the current fee
    */
   public int getTransFee() 
   {   
      return transFee;
   }
   
   /**
   * setTransFee - sets the transaction fee.
   * @param transFee, the amount of the fee.
   *
   */ 
   public void setTransFee(int transFee)
   {
      this.transFee = transFee;
   }
}