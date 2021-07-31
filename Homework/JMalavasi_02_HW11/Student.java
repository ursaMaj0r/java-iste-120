/**
 * Class to model Student
 *
 * @author Malavasi
 * @version 20210425
*/

public class Student
{
   // declare attributes
   private String name, id; // name and id of student
   private int numCredits; // total number of credits
   
   /**
   * Parameterized Constructor
   * @param name student name
   * @param id student id 
   * @param numCredits total number of credits
   */
   public Student(String name, String id, int numCredits)
   {
      this.name = name;
      this.id = id;
      this.numCredits = numCredits;
   }
   
   /**
   * Default Constructor
   */
   public Student()
   {
      new Student("first last", "00000", 0);
   }
   
   /**
   * retrieves the current name
   * @return the current name.
   *
   */ 
   public String getName()
   {
      return name;
   }
     
   /**
   * sets the name
   * @param newName the new name.
   *
   */ 
   public void setName(String newName)
   {
      name = newName;
   }

   /**
   * retrieves the current id
   * @return the current id.
   *
   */ 
   public String getId()
   {
      return id;
   }
     
   /**
   * sets the id
   * @param newId the new id.
   *
   */ 
   public void setId(String newId)
   {
      id = newId;
   }
   
   /**
   * retrieves the current number of credits
   * @return the numCredits.
   *
   */ 
   public int getNumCredits()
   {
      return numCredits;
   }
     
   /**
   * sets the number of Credits
   * @param newNumCredits the new numCredits.
   *
   */ 
   public void setNumCredits(int newNumCredits)
   {
      numCredits = newNumCredits;
   }
   
   /**
   * calculates the tuition cost
   * @return the cost of tuition
   */ 
   public double calcTuition()
   {
      return 0.0;
   }
   
   /**
   * prints out student information
   *
   */ 
   public String toString()
   {
      return String.format("\tName:\t %s\n\tId:\t %s\n\tCredits:\t %d\n",getName(),getId(),getNumCredits());
   }
}