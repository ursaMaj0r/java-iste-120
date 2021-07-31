/*
* Name: Jeff Malavasi
* Course: ISTE-120
* HW: #2-2
* Description: A class to test the BankAccount class
*/

public class BankTransactions 
{
   public static void main(String[] args) 
   {
         // instantiate Bank Accounts for Jim
         BankAccount jimSavings = new BankAccount("Jim's Savings");
         BankAccount jimChecking = new BankAccount("Jim's Checking");
         
         // instantiate Bank Accounts for Jen
         BankAccount jenChecking = new BankAccount("Jen's Checking", 500);
         
         // Deposit $3000 into jimSavings
         jimSavings.deposit(3000);
         
         // Get balance of jimSavings
         jimSavings.printBalance();
         
         // Draw line
         jimSavings.printLineA();
         
         // Get balance of jimChecking
         jimChecking.printBalance();
         
         // Transfer $500 from jimSavings to jimChecking
         jimChecking.transfer(jimSavings,500);
         
         // Get balance of jimChecking
         jimChecking.printBalance();
         
         // Withdraw $500 from jimChecking
         jimChecking.withdraw(500);
         
         // Get balance of jimChecking
         jimChecking.printBalance();
         
         // Get balance of jimSavings
         jimSavings.printBalance();
         
         // Draw line
         jimSavings.printLineA();
         
         // Get balance of jenChecking
         jenChecking.printBalance();
         
         // Transfer $500 from jimSavings to jenChecking
         jenChecking.transfer(jimSavings,500);
         
         // Get balance of jenChecking
         jenChecking.printBalance();
         
         // Withdraw $50 from jenChecking
         jenChecking.withdraw(50);
         
         // Get balance of jenChecking
         jenChecking.printBalance();
         
         // Draw line
         jimSavings.printLineA();
         
         // Get balance of jimSavings
         jimSavings.printBalance();
   }
}
