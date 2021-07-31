/**
 * TestStudentRecord - Class to test Student Class
 * @author  J. Malavasi
 * @version 20210218
 */
 
public class TestStudentRecord
{
   public static void main(String[] args)
   {
      // instantiate first student using default constructor
      Student stu1 = new Student("Barbara", "Bluestone", 23686, 2.8);
      Address addr1 = new Address("Main St.", "Any Town", "NY", 14539);
      StudentRecord stuRecord1 = new StudentRecord(stu1,addr1);
   
      // print student record
      System.out.println(stuRecord1.toString());
      
      // instantiate second student using parametized constructor
      StudentRecord stuRecord2 = new StudentRecord("Matthew", "Broderick", 39872, 3.5, "34 Worsted Pl", "NoPlaceVille", "UT", 29873);
      
      // print student record
      System.out.println(stuRecord2.toString());
   }
}