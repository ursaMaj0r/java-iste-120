/**
 * Class to extend Student - Grad
 *
 * @author Malavasi
 * @version 20210425
*/

public class Grad extends Student
{
   // declare attributes
   private String researchArea; // area of research
   
   /**
   * Default Constructor
   */
   public Grad()
   {
      super();
      setResearchArea("");
   }
   
   /**
   * retrieves the current research area
   * @return the current research area.
   *
   */ 
   public String getResearchArea()
   {
      return researchArea;
   }
     
   /**
   * sets the research area
   * @param newResearchArea the new research area.
   *
   */ 
   public void setResearchArea(String newResearchArea)
   {
      researchArea = newResearchArea;
   }
   
   /**
   * calculates the tuition cost
   * @return the cost of tuition
   */ 
   public double calcTuition()
   {
      final int creditHourCost = 713;
      return getNumCredits() * creditHourCost;
   }
   
   /**
   * prints out student information
   *
   */ 
   public String toString()
   {
      return String.format("\tName:\t %s\n\tId:\t %s\n\tCredits:\t %d\n\tResearch Area:\t %s\n\tTuition:\t $%.2f\n",getName(),super.getId(),super.getNumCredits(),getResearchArea(),calcTuition());
   }
}