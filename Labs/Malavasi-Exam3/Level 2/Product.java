/**
 * Class to model Product
 *
 * @author Malavasi
 * @version 20210417
*/

public class Product
{
   private String productCode; // Code for product
   private String partID; // identifier of part
   private int assemblyNumber; // product assembly number
   private int locationCode; // identifier of location
   
   /**
   * Default Constructor
   *
   */
   public Product()
   {
      productCode = "????";
      partID = "????";
      assemblyNumber = 0;
      locationCode = -1;
   }
   
   /**
   * Parameterized Constructor
   * @param departmentCode Code for Department
   * @param coruseNumber identifier of course
   * @param sectionNumber course section
   */
   public Product(String productCode, String partID, int assemblyNumber)
   {
      this.productCode = productCode;
      this.partID = partID;
      this.assemblyNumber = assemblyNumber;
      locationCode = 0;
   }
   
   /**
   * Parameterized Constructor
   * @param productPart full product part
   */
   public Product(String productPart)
   {
      String[] productInfo = productPart.split(":");
      this.productCode = productInfo[0];
      this.assemblyNumber = Integer.parseInt(productInfo[1]);
      this.partID = productInfo[2];
      locationCode = 0;
   }
   
   /**
   * retrieves the current productCode
   * @return the current productCode.
   *
   */ 
   public String getProductCode()
   {
      return productCode;
   }
        
   /**
   * sets the productCode
   * @param newCourseNumber the new produt code.
   *
   */ 
   public void setProductCode(String newProductCode)
   {
      productCode = newProductCode;
   }
   
   /**
   * retrieves the current part ID
   * @return the current partID.
   *
   */ 
   public String getPartID()
   {
      return partID;
   }
        
   /**
   * sets the part ID
   * @param newPartID the new part ID.
   *
   */ 
   public void setPartID(String newPartID)
   {
      partID = newPartID;
   }
   
   /**
   * retrieves the current assembly number
   * @return the current assemblyNumber.
   *
   */ 
   public int getAssemblyNumber()
   {
      return assemblyNumber;
   }
        
   /**
   * sets the assemblyNumber
   * @param newAssemblyNumber the new assembly number
   *
   */ 
   public void setAssemblyNumber(int newAssemblyNumber)
   {
      assemblyNumber = newAssemblyNumber;
   }
      
   /**
   * retrieves the locat code
   * @return the current locationCode.
   *
   */ 
   public int getLocationCode()
   {
      return locationCode;
   }
        
   /**
   * sets the location code
   * @param newLocationCode the new location code.
   *
   */ 
   public void setLocationCode(int newLocationCode)
   {
      locationCode = newLocationCode;
   } 
   
   /**
   * retrieves the current product part
   * @return the current productPart.
   *
   */ 
   public String getProductPart()
   {
      String output = String.format("%s:%07d:%s", getProductCode(),getAssemblyNumber(),getPartID());
      return output;
   }
}