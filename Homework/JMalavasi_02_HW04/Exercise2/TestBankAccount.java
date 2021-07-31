/**
 * TestBankAccount - Class to test BankAccount
 * @author Malavasi
 * @version 20210228
*/

public class TestBankAccount
{
   public static void main(String[] args)
   {
      // instantiate bank accounts and set number of free transcations and fee
      BankAccount testBank1 = new BankAccount(1000);
      testBank1.setNumFreeTrans(5);
      testBank1.setTransFee(2);
      
      // MONTH 1
      // print starting balance
      System.out.println("Starting Balance: " + testBank1.getBalance());
      
      // make transcations
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200 -4 transactions");  
      testBank1.deposit(1000);
      testBank1.withdraw(500);
      testBank1.withdraw(400);
      testBank1.deposit(200);
      
      // print balance
      System.out.println("Balance: " + testBank1.getBalance());
      System.out.println("Expected: 1300");
      
      // apply monthly charge
      testBank1.deductMonthlyCharge();
      System.out.println("applying monthly charge");
      System.out.println("Ending Balance Month 1: " + testBank1.getBalance());
      System.out.println("Expected: 1300\n");

      // MONTH 2
      // print starting balance
      System.out.println("Starting Balance: " + testBank1.getBalance());
      
      // make transcations
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500 - 5 transactions");  
      testBank1.deposit(1000);
      testBank1.withdraw(500);
      testBank1.withdraw(400);
      testBank1.deposit(200);
      testBank1.deposit(500);
      
      // print balance
      System.out.println("Balance: " + testBank1.getBalance());
      System.out.println("Expected: 2100");
      
      // apply monthly charge
      testBank1.deductMonthlyCharge();
      System.out.println("applying monthly charge");
      System.out.println("Ending Balance Month 2: " + testBank1.getBalance());
      System.out.println("Expected: 2100\n");      

      // MONTH 3
      // print starting balance
      System.out.println("Starting Balance: " + testBank1.getBalance());
      
      // make transcations
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000 - 6 transactions");  
      testBank1.deposit(1000);
      testBank1.withdraw(500);
      testBank1.withdraw(400);
      testBank1.deposit(200);
      testBank1.deposit(500);
      testBank1.withdraw(1000);
      
      // print balance
      System.out.println("Balance: " + testBank1.getBalance());
      System.out.println("Expected: 1900");
      
      // apply monthly charge
      testBank1.deductMonthlyCharge();
      System.out.println("applying monthly charge");
      System.out.println("Ending Balance Month 3: " + testBank1.getBalance());
      System.out.println("Expected: 1898\n");

      // MONTH 4
      // print starting balance
      System.out.println("Starting Balance: " + testBank1.getBalance());
      
      // make transcations
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000, deposit 100 - 7 transactions");  
      testBank1.deposit(1000);
      testBank1.withdraw(500);
      testBank1.withdraw(400);
      testBank1.deposit(200);
      testBank1.deposit(500);
      testBank1.withdraw(1000);
      testBank1.deposit(100);
      
      // print balance
      System.out.println("Balance: " + testBank1.getBalance());
      System.out.println("Expected: 1798");
      
      // apply monthly charge
      testBank1.deductMonthlyCharge();
      System.out.println("applying monthly charge");
      System.out.println("Ending Balance Month 4: " + testBank1.getBalance());
      System.out.println("Expected: 1794\n"); 
   }
}