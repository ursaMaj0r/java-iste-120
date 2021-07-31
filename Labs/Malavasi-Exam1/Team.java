// Team

public class Team 
{
	// attributes
	private String teamName;
	private Athlete captain;

	// constructor
	public Team() 
   {
			teamName = "Unknown";
	}
   
	public Team(String aName, Athlete anAthlete) 
   {
		teamName = aName;
		captain = anAthlete;
	}

	// accessors
	public String getTeamName() 
   {
		return teamName;
	}

	public Athlete getCaptain() 
   {
		return captain;
	}

	//mutators
	public void setTeamName(String aName) 
   {
		teamName = aName;
	}

	public void setCaptain(Athlete anAthlete) 
   {
		captain = anAthlete;
	}
}