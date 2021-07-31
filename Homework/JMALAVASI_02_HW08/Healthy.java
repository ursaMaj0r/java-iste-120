/**
 * Healthy - Class to calculate health info
 * about a person 
 *
 * @author Malavasi
 * @version 20210404
*/

public class Healthy
{
   private String name; // name of person
   private char gender; // gender of person
   private double weight; // weight in pounds of person
   private double height; // height in inches of person
   private double age; // age of person
   private int activityLevel; // activity level of person
   
    /**
    * Default Constructor
    * @param name Name of Person
    * @param gender Gender of Person
    * @param weight Weight of Person
    * @param height Height of Person
    * @param age Age of Person
    * @param activityLevel Activity Level of Person
    */
   public Healthy()
   {
      this.name = "";
      this.gender = 'x';
      this.weight = 0.0;
      this.height = 0.0;
      this.age = 0.0;
      this.activityLevel = 0;
   }
    
   /**
   * getName - retrieve the current name of the person
   * @return name the current name of the person.
   *
   */ 
   public String getName()
   {
      return name;
   } 
   
  /**
   * setName - sets the name of the person
   * @param newName the new name of the person.
   * @return result validation
   *
   */ 
   public boolean setName(String newName)
   {  
      if (newName.length() > 0)
      {
         name = newName;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   * getGender - retrieve the current gender of the person
   * @return gender the current gender of the person.
   *
   */ 
   public char getGender()
   {
      return gender;
   }
   
   /**
   * setGender - sets the gender of the person
   * @param newGender the new name of the person.
   * @return result validation
   *
   */ 
   public boolean setGender(char newGender)
   {  
      if (newGender == 'm' || newGender == 'M' || newGender == 'f' || newGender == 'F')
      {
         gender = newGender;
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
   * getWeight - retrieve the current weight of the person
   * @return weight the current weight of the person.
   *
   */ 
   public double getWeight()
   {
      return weight;
   } 
   
   /**
   * setWeight - sets the weight of the person
   * @param newWeight the new weight of the person.
   * @return result validation
   *
   */ 
   public boolean setWeight(double newWeight)
   {  
      if (newWeight >= 100)
      {
         weight = newWeight;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   * getHeight - retrieve the current height of the person
   * @return height the current height of the person.
   *
   */ 
   public double getHeight()
   {
      return height;
   }
   
   /**
   * setHeight - sets the height of the person
   * @param newHeight the new weight of the person.
   * @return result validation
   *
   */ 
   public boolean setHeight(double newHeight)
   {  
      if (newHeight >= 60 && newHeight <= 84 )
      {
         height = newHeight;
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
   * getAge - retrieve the current age of the person
   * @return age the current age of the person.
   *
   */ 
   public double getAge()
   {
      return age;
   } 
   
   /**
   * setAge - sets the age of the person
   * @param newAge the new weight of the person.
   * @return result validation
   *
   */ 
   public boolean setAge(double newAge)
   {  
      if ( newAge >= 18 )
      {
         age = newAge;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   * getActivityLevel - retrieve the current activity level of the person
   * @return activityLevel the current activity level of the person.
   *
   */ 
   public int getActivityLevel()
   {
      return activityLevel;
   }
   
   /*
   * setActivityLevel - sets the Activity Level of the person
   * @param newActivityLevel the new activity level of the person.
   * @return result validation
   *
   */ 
   public boolean setActivityLevel(int newActivityLevel)
   {  
      if ( newActivityLevel >= 1 && newActivityLevel <= 5 )
      {
         activityLevel = newActivityLevel;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
   * calcBMI - calculates the BMI of the person
   * @return BMI the BMI of the person.
   *t
   */ 
   public double calcBMI()
   {
      double BMI = ((weight)/(height*height))*703; 
      return BMI;
   }  
   
   /**
   * calcWeightClass - calculates the weight classification of the person
   * @return weightClass the weight classification of the person.
   *
   */ 
   public String calcWeightClass()
   {
      String weightClass = ""; // initialize weightClass
      
      // determine weight class
      if (calcBMI() < 18.5)
      {
         weightClass = "Underweight";
      }
      else if (calcBMI() >= 18.5 && calcBMI() < 25)
      {
         weightClass = "Normal weight";
      }
      else if (calcBMI() >= 25 && calcBMI() < 30)
      {
         weightClass = "Overweight";
      }
      else
      {
         weightClass = "Obese";
      }
      return weightClass;
   }
   
   /**
   * calcBMR - calculates the BMR of the person
   * @return BMR the BMR of the person.
   *
   */ 
   public double calcBMR()
   {
      double BMR; //initial BMR
   
      // calculate BMR based on gender
      if (gender == 'm' || gender == 'M')
      {
         BMR = 66 + (13.7 * convertPounds()) + (5 * convertInches()) - (6.8 * age);
      }
      else
      {
         BMR = 655 + (9.6 * convertPounds()) + (1.8 * convertInches()) - (4.7 * age);
      }
       
      return BMR;
   } 
   
   /**
   * calcTDEE - calculates the TDEE of the person
   * @return TDEE the TDEE of the person.
   *
   */ 
   public double calcTDEE()
   {
      double TDEE = 0; // initialize TDEE
      
      switch (getActivityLevel())
      {
         case 1:
            TDEE = calcBMR()*1.2;
            break;
         case 2:
            TDEE = calcBMR()*1.375;
            break;
         case 3:
            TDEE = calcBMR()*1.55;
            break;
         case 4:
            TDEE = calcBMR()*1.725;
            break;
         case 5:
            TDEE = calcBMR()*1.9;
            break;
      }
      return TDEE;
   } 
   
   /**
   * convertPounds - converts mass from pounds to kilograms
   * @return metricWeight the weight in kilograms.
   *
   */ 
   private double convertPounds()
   {
      final double conversionFactor = 0.453592;
      double metricWeight = weight*conversionFactor; 
      return metricWeight;
   }
   
   /**
   * convertInches - converts lenghth from inches to centimeters
   * @return metricHeight the height in centimeters.
   *
   */ 
   private double convertInches()
   {
      final double conversionFactor = 2.54;
      double metricHeight = height*conversionFactor; 
      return metricHeight;
   }          
}