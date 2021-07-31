/**
 * Member - class to implement credit union member
 *
 * @author Malavasi
 * @class Practical4 2205
 * @version 20210504
*/

public class Member implements Common
{
   // declare attributes
   private String name; // name of member
   private int id; // member ID number
   private String memberType; // type of member
   private int defaultAccount; // default account type

   /**
   * Default Constructor
   */
   public Member()
   {
      name = "Undefined";
      memberType = "Undefined";
      id = UNKNOWN;
      defaultAccount = UNKNOWN;
   }
   
   /**
   * Parameterized Constructor
   * @param name of member
   * @param id of member
   * @param memberType type of member
   * @param defaultAccount default account type
   */
   public Member(String name, int id, String memberType, int defaultAccount)
   {
      this.name = name;
      this.id = id;     
      this.memberType = memberType;
      this.defaultAccount = defaultAccount;
   }

   /**
   * returns all Member info
   * @return output Member information.
   *
   */ 
   public String toString()
   {
      if (memberType.equals("P"))
      {
         memberType = "Primary";
      }
      else
      {
         memberType = "Secondary";
      }
      
      String output = String.format("Member %05d: %s is a %s member.",id, name, memberType);
      
      if (defaultAccount == CHECKING)
      {
         output += String.format("\nThe default account is a checking account.");
      }
      else
      {
         output += String.format("\nThe default account is a savings account.");
      }
      
      return output;
   }
}