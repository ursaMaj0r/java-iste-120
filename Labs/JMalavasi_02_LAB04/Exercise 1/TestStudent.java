/**
 * TestStudent - Class to test Student Class
 * @author  J. Malavasi
 * @version 20210218
 */
 
public class TestStudent
{
   public static void main(String[] args)
   {
      // validate toString() method
      Student stu = new Student("Jane", "Brown", 182765, 2.333);
      System.out.println(stu.toString());
   }
}