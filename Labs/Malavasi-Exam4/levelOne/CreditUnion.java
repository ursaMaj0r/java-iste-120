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
      
      // Create Report
      System.out.println("\nPatient Report:\n");
      int primaryCount = 0; // number of primary members
      int secondaryCount= 0; // number of secondary
      
      // for each member, print info
      for (Member member : members)
      {
         if (member instanceof Primary)
         {
            System.out.printf("%s\n", member.toString());
            primaryCount++;
         }
         else if (member instanceof Secondary)
         {
            System.out.printf("%s\n", member.toString());
            secondaryCount++;         
         }
      }
      
      // print totals
      System.out.printf("Primary Members: %d\nSecondary Members: %d", primaryCount, secondaryCount);
   }
}