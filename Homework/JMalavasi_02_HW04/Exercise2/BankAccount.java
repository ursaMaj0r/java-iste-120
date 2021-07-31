/**
 * BankAccount - Class to model a bank account, which has a balance that 
 * can be changed by deposits and withdrawals.
 *
 * @author Malavasi
 * @version 20210228
*/

public class BankAccount 
{ 

   private double balance; // the balance of the acct
   private int transFee; // the fee per transcation
   private int numFreeTrans; // the number of free transations per cycle
   private int transCount; // the number of transcations in current cycle

   /**
    * Constructs a bank account with a zero balance
    */
   public BankAccount() 
   {   
      balance = 0;
      transCount = 0;
   }

   /**
    * Constructs a bank account with a given balance
    * @param initialBalance the initial balance
    */
   public BankAccount(double initialBalance) 
   {   
      balance = initialBalance;
      transCount = 0;
   }

   /**
    * Deposits money into the bank account.
    * @param amount the amount to deposit
    */
   public void deposit(double amount) 
   {  
      double newBalance = balance + amount;
      balance = newBalance;
      transCount++; // increment counter
   }

   /**
    * Withdraws money from the bank account.
    * @param amount the amount to withdraw
    */
   public void withdraw(double amount) 
   {   
      double newBalance = balance - amount;
      balance = newBalance;
      transCount++; // increment counter
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
   
   /**
   * setNumFreeTrans - sets the number of free transactions.
   * @param transFee, the number of transactions before fee.
   *
   */ 
   public void setNumFreeTrans(int numFreeTrans)
   {
      this.numFreeTrans = numFreeTrans;
   }
   
   /**
   * deductMonthlyCharge - deducts any transaction fees and resets counter.
   *
   */ 
   public void deductMonthlyCharge()
   {
      // get number of transcations, adjusted for free
      int adjustedTransCount = Math.max(transCount, numFreeTrans);
      
      // deduct from balance
      this.balance -= (adjustedTransCount * transFee) - (numFreeTrans * transFee);
      
      // reset transaction counter
      transCount = 0;
   }
}