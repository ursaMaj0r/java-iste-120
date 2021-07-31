/**
 * Student - Class to model a student gradebook.
 * @author Malavasi
 * @version 20210228
*/
public class Student
{
   // Declare Attributes
   private String name; // name of the student
   private int id; // id of the student
   private int sumGrades; // the sum of the scores of all grades
   private int numGrades; // the number of grades
   
   /**
    *  Constructs a student record with a given name and id
    *  @param name the name of the student
    *  @param initialBalance the id of the student
    */
   public Student(String name, int id)
   {
      this.name = name;
      this.id = id;
   }
   
   /**
   * addGrade - records the grade of a quiz
   * @param newGrade, the score to record.
   *
   */ 
   public void addGrade(double newGrade)
   {
      this.sumGrades += newGrade;
      this.numGrades++;
   }
   
   /**
   * getAverage - returns the quiz average for a student
   * @return average, the average score.
   *
   */ 
   public double getAverage()
   {
      double average = (double) sumGrades/numGrades;
      return average;
   }
   
  /**
   * toString - outputs the student and average to the stream as a string
   * @return value of average for a student.
   *
   */ 
   public String toString()
   {
      String output = String.format("%-10.10s %5d %7.2f  ",name, id,getAverage()); 
      return output;
   }    
}