import java.util.ArrayList; // import Array List
import java.io.*; // for all the IO classes

/**
 * test class for credit union proof of concept
 *
 * @author Malavasi
 * @class Practical4 2205
 * @version 20210504
*/
public class CreditUnion
{
   public static void main(String[] args)
   {
      // Instantiate Members in credit union
      Primary mem1 = new Primary(886, "Robert J. Smith", 1, 129325.56);
      Secondary mem2 = new Secondary(13817, "Sally R. Schultz", 2, "yes");
      Primary mem3 = new Primary(06707, "Judith A. Barth", 2, 2748.90);
      Secondary mem4 = new Secondary(36198, "Diane C. Baker", 1, "no");
      Primary mem5 = new Primary(58409, "James T. Kirk", 1, 378457.94);
      
      // Create ArrayList for Report
      ArrayList<Member> members = new ArrayList<Member>();
      members.add(mem1);
      members.add(mem2);
      members.add(mem3);
      members.add(mem4);
      members.add(mem5);
      
      try
      {
         // Define Output file
         final String outputFileName = "Members.txt";
         File outputFile = new File(outputFileName);
         PrintWriter output;
      
         // If output file exists, append else create output file
         if (outputFile.exists())
         {
            System.out.printf("Adding to the current file %s", outputFileName);
            output = new PrintWriter(new FileWriter(new File(outputFile.getName()),true));
         }
         else
         {
            System.out.printf("Creating a new file %s", outputFileName);
            output = new PrintWriter(new FileWriter(new File(outputFile.getName())));
         }
         
         // Create Report
         output.println("\nPatient Report:\n");
         int primaryCount = 0; // number of primary members
         int secondaryCount= 0; // number of secondary
      
         // for each member, print info
         for (Member member : members)
         {
            if (member instanceof Primary)
            {
               output.printf("%s\n", member.toString());
               primaryCount++;
            }
            else if (member instanceof Secondary)
            {
               output.printf("%s\n", member.toString());
               secondaryCount++;         
            }
         }
      
         // print totals
         output.printf("Primary Members: %d\nSecondary Members: %d", primaryCount, secondaryCount);
      
         // close output stream
         output.close();
      }
      catch (IOException ioe)
      {
         System.out.println("ERROR: " + ioe);
         System.exit(1);
      }
   }
}