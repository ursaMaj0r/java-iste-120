/**
 * Secondary - subclass of Member 
 *
 * @author Malavasi
 * @class Practical4 2205
 * @version 20210504
*/

public class Secondary extends Member
{
   // declare attributes
   private String authorized; // whether the member is allowed to access the name of the patients child
   
   /**
   * Parameterized Constructor
   * @param id of member
   * @param name of member
   * @param defaultAccount default account type
   * @param authorized ability to access name of patients child
   */
   public Secondary(int id, String name, int defaultAccount, String authorized)
   {
      super(name, id, SECONDARY_MEMBER, defaultAccount);
      this.authorized = authorized;
   }

   /**
   * returns all secondary member info
   * @return output primary member information.
   *
   */ 
   public String toString()
   {
      String output = String.format("Secondary %s\nThe member is authorized: %s\n", super.toString(),authorized);
      return output;
   }
}