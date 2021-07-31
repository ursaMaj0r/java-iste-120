import java.util.*;
/**
 * HowHealthy - Class to use Healthy class 
 *
 * @author Malavasi
 * @version 20210404
*/

public class HowHealthy
{
   public static void main(String[] args)
   {
      // declare variables
      String name = "";
      char gender = 'x';
      double weight = 0;
      double height = 0;
      double age = 0;
      int activityLevel = 1;
      boolean newPerson = true;
      
      while (newPerson)
      {
         //Instantiate Healthy
         Healthy person = new Healthy();
         
         // instantiate scanner
         Scanner in = new Scanner(System.in);
         
         // prompt for name
         boolean keepGoing = false; // reset flow
         while (!keepGoing)
         {
            System.out.print("What is your name: ");
            name = in.nextLine();
            
            // check for length greater than 0
            if (person.setName(name))
            {
               keepGoing = true;
            }
            else
            {
               System.out.println("invalid input, name must be at least one character.");
            }
         }
         
         // prompt for gender
         keepGoing = false; // reset input validation
         while (!keepGoing)
         {
            System.out.printf("%s, are you male or female (M/F): ", name);
            gender = in.next().charAt(0); in.nextLine();
            
            // check for valid characters
            if(person.setGender(gender))
            {
               keepGoing = true;
            }
            else
            {
               System.out.println("invalid input, please enter m or f.");
            }
         }
         
         // prompt for weight
         keepGoing = false; // reset input validation
         while (!keepGoing)
         {
            System.out.printf("%s's, what is your weight in pounds: ", name);
            weight = in.nextDouble(); in.nextLine();
            
            // check for weight greater than 100
            if (person.setWeight(weight))
            {
               keepGoing = true;
            }
            else
            {
               System.out.println("invalid input, weight must be at least 100 pounds.");
            }
         }
         
         // prompt for height
         keepGoing = false; // reset input validation
         while (!keepGoing)
         {
            System.out.printf("%s's, what is your height in inches: ", name);
            height = in.nextDouble(); in.nextLine();
            
            // check for height in range
            if (person.setHeight(height))
            {
               keepGoing = true;
            }
            else
            {
               System.out.println("invalid input, height must be between 60 and 84 inches inclusively.");
            }
         }
         
         // prompt for age
         keepGoing = false; // reset input validation
         while (!keepGoing)
         {
            System.out.printf("%s's, what is your age: ", name);
            age = in.nextDouble(); in.nextLine();
            
            // check for age greater than 18
            if (person.setAge(age))
            {
               keepGoing = true;
            }
            else
            {
               System.out.println("invalid input, age must be at least 18 years.");
            }
         }
         
         // prompt for activityLevel
         keepGoing = false; // reset input validation
         while (!keepGoing)
         {
            System.out.printf("%s's, what is your activity level:\n", name);
            System.out.println("    1 - Sedentary (little or no exercise, desk job)");
            System.out.println("    2 - Lightly Active (light exercise/sports 1-3 days/wk)");
            System.out.println("    3 - Moderately Active (mdoerate exercise/sports 3-5 days/wk)");
            System.out.println("    4 - Very Active (hard exercise/sports 6-7 days/wk)");
            System.out.println("    5 - Extra Active (hard daily exercise/sports & physical job or 2x day)");
            activityLevel = in.nextInt(); in.nextLine();
            
            // check for valid range
            if (person.setActivityLevel(activityLevel))
            {
               keepGoing = true;
            }
            else
            {
               System.out.println("invalid input, activity level must be between 1 and 5 inclusively.");
            }
         }
         
         // Print Output
         System.out.printf("\n\n%s's information:\n",name);
         System.out.printf("Weight: %.0f\n",weight);
         System.out.printf("Height: %.0f\n",height);
         System.out.printf("Age: %.0f\n",age);
         System.out.printf("\nThe following calculations are for gender: %s\n",gender);
               
         //Calculate info
         System.out.printf("     BMR is %.2f", person.calcBMR());
         System.out.printf("     BMI is %.2f",person.calcBMI());
         System.out.printf("     TDEE is %.2f",person.calcTDEE());
         System.out.printf("\n     Your BMI classifies you as %s",person.calcWeightClass());
      
         //Prompt for new person
         keepGoing = false; // reset input validation
         while (!keepGoing)
         {
            System.out.print("\n\nDo you wish to do another calculation?: ");
            String result = "";
            result = in.nextLine();
            
            // check for age greater than 18
            if (Character.toUpperCase(result.charAt(0)) == 'N')
            {
               keepGoing = true;
               newPerson = false;
            }
            else if (Character.toUpperCase(result.charAt(0)) == 'Y')
            {
               keepGoing = true;
               newPerson = true;
            }
            else
            {
               System.out.println("invalid input, please enter yes or no.");
            }
         }

      }
   }
}