import java.util.*; // import scanner class

/**
 * TestCourse - Class to test Course Class 
 *
 * @author Malavasi
 * @version 202100417
*/

public class TestCourse
{
   public static void main(String[] args)
   {
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      
      // prompt for department code
      System.out.print("Enter the 4-character department code: ");
      String departmentCode = in.nextLine();
      while (departmentCode.length() != 4)
      {
          // Print Error
         System.out.println("invalid input, department code must be exactly four characters.");
         
         // Reprompt   
         System.out.print("Enter the 4-character department code: ");
         departmentCode = in.nextLine();
      }
      
      // prompt for course number
      System.out.print("Enter the 3-character course number: ");
      String courseNumber = in.nextLine();
      while (courseNumber.length() != 3)
      {
          // Print Error
         System.out.println("invalid input, course number must be exactly three characters.");
         
         // Reprompt   
         System.out.print("Enter the 3-character course number: ");
         courseNumber = in.nextLine();
      }
      
      // prompt for section number
      System.out.print("Enter the 2-character section number: ");
      String sectionNumber = in.nextLine();
      while (sectionNumber.length() != 2)
      {
          // Print Error
         System.out.println("invalid input, course number must be exactly two characters.");
         
         // Reprompt   
         System.out.print("Enter the 2-character section number: ");
         sectionNumber = in.nextLine();
      }
      
      // prompt for student credit
      System.out.print("Enter the student credit for this course: ");
      int studentCredit = in.nextInt(); in.nextLine(); // reset scanner
      while (studentCredit < 0)
      {
          // Print Error
         System.out.println("invalid input, student credit must be greater than or equal to zero.");
         
         // Reprompt   
         System.out.print("Enter the student credit for this course: ");
         studentCredit = in.nextInt(); in.nextLine(); // reset scanner
      }
      
      //Instantiates Course One
      Course course1 = new Course(departmentCode, courseNumber, sectionNumber);
      
      //Set Course Credit Value
      course1.setStudentCredit(studentCredit);
      
      // Print Course Info
      System.out.printf("Course %s-%s-%s is worth %d credit hours.\n", course1.getDepartmentCode(),course1.getCourseNumber(),course1.getSectionNumber(),course1.getStudentCredit());
   
      //Instantiates Course Two
      Course course2 = new Course(course1.getDepartmentCode() + "-" + course1.getCourseNumber() + "-" + course1.getSectionNumber());
      
      //Set Course Credit Value
      course2.setStudentCredit(studentCredit);
      
      // Print Course Info
      System.out.printf("Course %s is worth %d credit hours.\n", course2.getFullCourseIdentifier(),course1.getStudentCredit());
   
      // Prompt for number of books
      System.out.print("Enter the number of books for this course: ");
      int numBooks = in.nextInt(); in.nextLine(); // reset scanner
      while (numBooks < 0)
      {
          // Print Error
         System.out.println("invalid input, number of books must be greater than or equal to zero.");
         
         // Reprompt   
         System.out.print("Enter the number of books for this course: ");
         numBooks = in.nextInt(); in.nextLine(); // reset scanner
      }
      
      
      //Instantiate Course3
      Course course3 = new Course(course1.getDepartmentCode() + "-" + course1.getCourseNumber() + "-" + course1.getSectionNumber(),numBooks);
      
      
      // Prompt for book titles
      for (int i = 1; i <= course3.getTextbookCount(); i++)
      {
         System.out.printf("Enter book title(%d of %d): ", i, course3.getTextbookCount());
         course3.setTextbook(i-1, in.nextLine());
      }

      // Print Course Info
      System.out.printf("Course %s is worth %d credit hours and uses the following books:\n", course3.getFullCourseIdentifier(),course3.getStudentCredit());
      for (String book : course3.getTextbooks())
      {
         System.out.printf("     %s\n", book);
      }
   }
}