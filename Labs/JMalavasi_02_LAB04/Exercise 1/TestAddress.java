/**
 * TestAddress - Class to test Address Class
 * @author  J. Malavasi
 * @version 20210218
 */
 
public class TestAddress
{
   public static void main(String[] args)
   {
      // validate toString() method
      Address anAddress = new Address("13 Flower St.", "Pultneyville","NY",14386);
      System.out.println(anAddress.toString());
   }
}