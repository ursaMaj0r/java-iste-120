/**
 * StudentRecord - Class to model a single Student Record
 * @author  J. Malavasi
 * @version 20210218
 */
 
public class StudentRecord 
{
   // attributes of a StudentRecord
   private Student stu;
   private Address addr;
   
   /**
    * Student and Address Constructor.
    * @param Student the student object
    * @param Address the address object
    */
   public StudentRecord(Student stu, Address addr) 
   {
     this.stu = stu;
     this.addr = addr;
   }
   
  /**
    * Paramaterized Constructor.
    * @param _fName student's first name
    * @param _lName student's last name 
    * @param _id student's id number
    * @param _gpa students GPA    
    * @param street the street of the address
    * @param city  the city of the address
    * @param state the state of the address
    * @param zip the zip of the address
    */
   public StudentRecord(String firstName, String lastName, int studentId, double gpa, String street, String city, String state, int zip) 
   {
      stu = new Student(firstName, lastName, studentId, gpa);
      addr = new Address(street, city, state, zip);

   }
   
    /**
    * toString - Accessor to print address information
    * @return the full address
    */
   public String toString() {
      String output = stu.toString() + System.lineSeparator() + addr.toString() + System.lineSeparator();
      return output;
   }
}