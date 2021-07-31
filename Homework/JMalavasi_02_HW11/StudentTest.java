import java.util.*;

/**
 * TestCourse - Class to test Product Class 
 *
 * @author Malavasi
 * @version 202100417
*/

public class StudentTest
{
   public static void main(String[] args)
   {
      // instantiate scanner
      Scanner in = new Scanner(System.in);
      int studentType = 0;
      
      // instantiate result array
      ArrayList<Student> enrollment = new ArrayList<Student>();
      
      while (studentType != 3)
      {
      // prompt for student type
         System.out.print("\nWhat Type of Student do you wish to enter?\n\t1. Undergrad\n\t2. Graduate\n\t3. Done\nChoice: ");
         studentType = in.nextInt(); in.nextLine();
         while (studentType <1 || studentType >3)
         {
          // Print Error
            System.out.println("Invalid Choice");
         
         // Reprompt   
            System.out.print("\nWhat Type of Student do you wish to enter?\n\t1. Undergrad\n\t2. Graduate\n\t3. Done\nChoice: ");
            studentType = in.nextInt(); in.nextLine();
         }
          
      // switch on student type
         switch (studentType)
         {
            case 1: // undergrad
            {
            // gather standard info
               System.out.print("\nStudent Name: "); // name
               String studentName = in.nextLine();
            
               System.out.print("\nStudent Id: "); // id
               String studentID = in.nextLine();
            
               System.out.print("\nNumber of Credits: "); // number of credits
               int numCredits = in.nextInt(); in.nextLine();
            
            // gather undergrad info
               System.out.print("\nLevel: "); // number of credits
               int undergradLevel = in.nextInt(); in.nextLine();
            
            // instantiate undergraduate student
               Undergrad undergradStudent = new Undergrad(studentName, studentID, numCredits, undergradLevel);
            
            // add to data array
               enrollment.add(undergradStudent);
               break;
            }
         
            case 2: // grad
            {
            // gather standard info
               System.out.print("\nStudent Name: "); // name
               String studentName = in.nextLine();
            
               System.out.print("\nStudent Id: "); // id
               String studentID = in.nextLine();
            
               System.out.print("\nNumber of Credits: "); // number of credits
               int numCredits = in.nextInt(); in.nextLine();
            
            // gather undergrad info
               System.out.print("\nResearch Area: "); // area of research
               String gradResearchArea = in.nextLine();
            
            // instantiate grad student
               Grad gradStudent = new Grad();
               gradStudent.setName(studentName);
               gradStudent.setId(studentID);
               gradStudent.setNumCredits(numCredits);
               gradStudent.setResearchArea(gradResearchArea);
            
            // add to data array
               enrollment.add(gradStudent);
               break;
            }
         
            case 3: // print info
            {
               for (Student student : enrollment)
               {
                  if(student instanceof Undergrad)
                  {
                     System.out.println("Undergraduate Student:");
                  }
                  else
                  {
                     System.out.println("Graduate Student:");
                  }
               
                  System.out.println(student.toString());
               }
               break;
            }
         }
      }
   }
}