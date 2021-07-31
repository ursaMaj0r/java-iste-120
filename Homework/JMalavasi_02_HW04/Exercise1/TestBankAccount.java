/**
 * TestBankAccount - Class to test BankAccount
 * @author Malavasi
 * @version 20210228
*/

public class TestBankAccount
{
   public static void main(String[] args)
   {
      // instantiate a bank account without a fee
      BankAccount testBank1 = new BankAccount(100);
      
      // instantiate a bank account with a $1 fee
      BankAccount testBank2 = new BankAccount(100);
      testBank2.setTransFee(1);
      
      // make 5 transactions and print balance
      for (int i = 0; i <= 5; i++)
      {
         if(i == 0 )
         {
            // print initial amount and fee
            System.out.println("Bank1 Initial Balance " + testBank1.getBalance() +
               "\nTranscation Fee: " + testBank1.getTransFee());
            System.out.println("Bank2 Initial Balance " + testBank2.getBalance() +
               "\nTranscation Fee: " + testBank2.getTransFee());

         }
         else if ( i % 2 == 0 )
         {
            testBank1.withdraw(25);
            System.out.println("Bank1 Balance after $25 withdraw: " + testBank1.getBalance());
            
            testBank2.withdraw(25);
            System.out.println("Bank2 Balance after $25 withdraw: " + testBank2.getBalance());


         }
         else
         {
            testBank1.deposit(15);
            System.out.println("Bank1 Balance after $15 deposit: " + testBank1.getBalance());
         
            testBank2.deposit(15);
            System.out.println("Bank2 Balance after $15 deposit: " + testBank2.getBalance());
         }
       }
   }
}