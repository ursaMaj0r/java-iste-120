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
   private String[] textbooks; // array of textbooks for course
   
   
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
      textbooks = new String[1];
   }
   
   /**
   * Parameterized Constructor
   * @param fullCourseIdentifier Course Identifier
   */
   public Course(String fullCourseIdentifier)
   {
      String[] courseInfo = fullCourseIdentifier.split("-");
      this.departmentCode = courseInfo[0];
      this.courseNumber = courseInfo[1];
      this.sectionNumber = courseInfo[2];
      studentCredit = 0;
      textbooks = new String[1];
   }
   
   /**
   * Parameterized Constructor
   * @param fullCourseIdentifier Coourse Identifier
   * @param numTextbooks number of textbooks for course
   */
   public Course(String fullCourseIdentifier, int numTextbooks)
   {
      String[] courseInfo = fullCourseIdentifier.split("-");
      this.departmentCode = courseInfo[0];
      this.courseNumber = courseInfo[1];
      this.sectionNumber = courseInfo[2];
      studentCredit = 0;
      textbooks = new String[numTextbooks];
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
   
   /**
   * retrieves the current course Identifier
   * @return the current FullCourseIdentifier.
   *
   */ 
   public String getFullCourseIdentifier()
   {
      return getDepartmentCode() + "-" + getCourseNumber() + "-" + getSectionNumber();
   }
 
   /**
   * retrieves a textbook
   * @return the name of the textbook.
   *
   */ 
   public String getTextbook(int textbookNum)
   {
      return textbooks[textbookNum];
   }
   
     
   /**
   * sets the name of the textbook
   * @param newTextbookName the new textbook name.
   *
   */ 
   public void setTextbook(int textbookNum, String newTextbookName)
   {
       textbooks[textbookNum] = newTextbookName;
   }
   
   /**
   * retrieves textbook count
   * @return the number of textbooks.
   *
   */ 
   public int getTextbookCount()
   {
      return textbooks.length;
   }

}