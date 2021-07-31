import java.util.*;

/**
 * Report3 - Class to test Student
 * 
 * @author Malavasi
 * @version 20210228
 */
public class Report3 {
   public static void main(String[] args) {
      // declare variables
      String name;
      int id;
      int grade1;
      int grade2;
      int grade3;

      // instantiate scanner
      Scanner in = new Scanner(System.in);

      // Student 1
      // read in name
      System.out.print("Name: ");
      name = in.nextLine();

      // read in ID
      System.out.print("ID: ");
      id = in.nextInt();

      // instantiate student
      Student stu1 = new Student(name, id);

      // Read grades for student 1
      System.out.print("Grade1: ");
      grade1 = in.nextInt();
      System.out.print("Grade2: ");
      grade2 = in.nextInt();
      System.out.print("Grade3: ");
      grade3 = in.nextInt();

      // add grades to Student Record
      stu1.addGrade(grade1);
      stu1.addGrade(grade2);
      stu1.addGrade(grade3);

      // clear scanner
      in.nextLine();

      // Student 2
      // read in name
      System.out.print("Name: ");
      name = in.nextLine();

      // read in ID
      System.out.print("ID: ");
      id = in.nextInt();

      // instantiate student
      Student stu2 = new Student(name, id);

      // Read grades for student 1
      System.out.print("Grade1: ");
      grade1 = in.nextInt();
      System.out.print("Grade2: ");
      grade2 = in.nextInt();
      System.out.print("Grade3: ");
      grade3 = in.nextInt();

      // add grades to Student Record
      stu2.addGrade(grade1);
      stu2.addGrade(grade2);
      stu2.addGrade(grade3);

      // clear scanner
      in.nextLine();

      // Student 3
      // read in name
      System.out.print("Name: ");
      name = in.nextLine();

      // read in ID
      System.out.print("ID: ");
      id = in.nextInt();

      // instantiate student
      Student stu3 = new Student(name, id);

      // Read grades for student 1
      System.out.print("Grade1: ");
      grade1 = in.nextInt();
      System.out.print("Grade2: ");
      grade2 = in.nextInt();
      System.out.print("Grade3: ");
      grade3 = in.nextInt();

      // add grades to Student Record
      stu3.addGrade(grade1);
      stu3.addGrade(grade2);
      stu3.addGrade(grade3);

      // clear scanner
      in.nextLine();

      // Print Report
      System.out.println(stu1.toString());
      System.out.println(stu2.toString());
      System.out.println(stu3.toString());
   }
}