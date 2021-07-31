/*
* Lab01Ex2
* @author Jeff Malavasi
* @version 1.0.0
*/

public class Lab01Ex2
{
   public static void main(String[] args)
   {
      // create accounts
      Account account1 = new Account(); 
      Account account2 = new Account(); 
      Account account3 = new Account(); 
      
      // initialize account1
      account1.initialize("Jane");
      System.out.print("Account1: ");
      account1.print();
      account1.deposit(100); // deposit $100
      System.out.print("Account1: ");
      account1.print();
      account1.withdraw(40); // withdraw $40
      System.out.print("Account1: ");
      account1.print();
      account1.withdraw(20); // withdraw $20
      System.out.print("Account1: ");
      account1.print();
      
      
      // initialize account2
      account2.initialize("Fred");
      System.out.print("Account2: ");
      account2.print();
      account2.deposit(200); // deposit $200 
      System.out.print("Account2: ");
      account2.print();
      account2.withdraw(125); // withdraw $125
      System.out.print("Account2: ");
      account2.print();
      account2.deposit(60); // deposit $60
      System.out.print("Account2: ");
      account2.print();
      
      // initialize account3
      account3.initialize("George");
      System.out.print("Account3: ");
      account3.print();
      account3.deposit(50); // deposit $50 
      System.out.print("Account3: ");
      account3.print();
   }
}