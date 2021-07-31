/*
* Name: Jeff Malavasi
* Course: ISTE-120
* HW: #2-2
* Description: A class to test the CashRegister class
*/

public class RunCashRegister 
{
   public static void main(String[] args) 
   {
         // instantiate CashRegister for each customer
         CashRegister customer1 = new CashRegister();
         CashRegister customer2 = new CashRegister();
         
         // ring up items for customer1
         customer1.recordPurchase(49.95);
         customer1.recordPurchase(20.40);
         
         // record payment for customer1
         customer1.enterPayment(80);
         
         //print receipt for customer1
         customer1.printReceipt();
         
         // ring up items for customer2
         customer2.recordPurchase(99.95);
         customer2.recordPurchase(35.15);
         customer2.recordPurchase(50);
         
         // record payment for customer2
         customer2.enterPayment(180);
         
         //print receipt for customer2
         customer2.printReceipt();
   }
}