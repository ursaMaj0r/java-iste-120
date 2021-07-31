/**
 * Healthy - Class to calculate health info
 * about a person 
 *
 * @author Malavasi
 * @version 20210320
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
   public Healthy(String name, char gender, double weight, double height, double age, int activityLevel)
   {
      this.name = name;
      this.gender = gender;
      this.weight = weight;
      this.height = height;
      this.age = age;
      this.activityLevel = activityLevel;
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
   * getGender - retrieve the current gender of the person
   * @return gender the current gender of the person.
   *
   */ 
   public char getGender()
   {
      return gender;
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
   * getHeight - retrieve the current height of the person
   * @return height the current height of the person.
   *
   */ 
   public double getHeight()
   {
      return height;
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
   * getActivityLevel - retrieve the current activity level of the person
   * @return activityLevel the current activity level of the person.
   *
   */ 
   public int getActivityLevel()
   {
      return activityLevel;
   }
   
   /**
   * calcBMI - calculates the BMI of the person
   * @return BMI the BMI of the person.
   *
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