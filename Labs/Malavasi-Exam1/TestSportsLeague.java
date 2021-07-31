/**
 * Course: ISTE-120
 * Exam: Practical 1, Question 2 
 * Description: TestSportsLeague - A class to test the Athlete, Team & League classes 
 * @author  J. Malavasi
 * @version 20210220
 */
public class TestSportsLeague 
{
	public static void main(String[] args) 
   {
      // Instantiate Athlete 1
      Athlete athJAllen = new Athlete("Josh Allen", 17);
      
      // Instantiate Athlete 2
      Athlete athJPoyer = new Athlete("Jordan Poyer", 21);
      
      //Instantiate Team 1
      Team teamBuffBills = new Team("Buffalo Bills", athJPoyer);
      
      //Instantiate League 1
      League nfl = new League("NFL", athJAllen, teamBuffBills);
           
      //print League information
      nfl.printLeagueInfo();
	}
}