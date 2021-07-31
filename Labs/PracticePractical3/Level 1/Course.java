/**
 * Class to model Course
 *
 * @author Malavasi
 * @version 20210417
*/

public class Course
{
   private String departmentCode; // Code for Department
   private String courseNumber; // identifier of course
   private String sectionNumber; // course section
   private int studentCredit; // number of credits for course

   
   /**
   * Default Constructor
   *
   */
   public Course()
   {
      departmentCode = "0000";
      courseNumber = "000";
      sectionNumber = "00";
      studentCredit = 0;
   }
   
   /**
   * Parameterized Constructor
   * @param departmentCode Code for Department
   * @param coruseNumber identifier of course
   * @param sectionNumber course section
   */
   public Course(String departmentCode, String courseNumber, String sectionNumber)
   {
      this.departmentCode = departmentCode;
      this.courseNumber = courseNumber;
      this.sectionNumber = sectionNumber;
      studentCredit = 0;
   }
   
   
   /**
   * retrieves the current departmentCode
   * @return the current departmentCode.
   *
   */ 
   public String getDepartmentCode()
   {
      return departmentCode;
   }
   
     
   /**
   * sets the departmentCode
   * @param newCourseNumber the new department code.
   *
   */ 
   public void setDepartmentCode(String newDepartmentCode)
   {
      departmentCode = newDepartmentCode;
   }
   
   /**
   * retrieves the current courseNumber
   * @return the current courseNumber.
   *
   */ 
   public String getCourseNumber()
   {
      return courseNumber;
   }
   
     
   /**
   * sets the deparmentCode
   * @param newCourseNumber the new department code.
   *
   */ 
   public void setCourseNumber(String newCourseNumber)
   {
      courseNumber = newCourseNumber;
   }
   
   /**
   * retrieves the current sectionNumber
   * @return the current sectionNumber.
   *
   */ 
   public String getSectionNumber()
   {
      return sectionNumber;
   }
   
     
   /**
   * sets the deparmentCode
   * @param newSectionNumber the new department code.
   *
   */ 
   public void setSectionNumber(String newSectionNumber)
   {
      sectionNumber = newSectionNumber;
   }
      
   /**
   * retrieves the current student credit
   * @return the current studentCredit.
   *
   */ 
   public int getStudentCredit()
   {
      return studentCredit;
   }
   
     
   /**
   * sets the student credit
   * @param newStudentCredit the new student credit.
   *
   */ 
   public void setStudentCredit(int newStudentCredit)
   {
      studentCredit = newStudentCredit;
   } 
}