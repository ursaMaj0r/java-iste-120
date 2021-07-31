/**
 * Class to model Template
 *
 * @author Malavasi
 * @version 20210321
*/

public class TemplateClass
{
   private String string; // parameter

   
   /**
   * Default Constructor
   *
   */
   public TemplateClass()
   {
      string = "Unknown";
   }
   
   /**
   * Parameterized Constructor
   * @param seafoodType type of seafood
   */
   public TemplateClass(String string)
   {
      this.string = string;
   }
   
   /**
   * retrieves the current string
   * @return the current string.
   *
   */ 
   public String getString()
   {
      return string;
   }
   
     
   /**
   * sets the string
   * @param newString the new string.
   *
   */ 
   public void setString(String newString)
   {
      string = newString;
   }
}