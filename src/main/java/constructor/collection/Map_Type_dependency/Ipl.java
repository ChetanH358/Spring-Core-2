package constructor.collection.Map_Type_dependency;

import java.util.Map;

public class Ipl {
	private String team_name;
	private String captain_name;
	
//	Map<key,value>
//	Map<Runs,Player_Name>
	
	private Map<Integer, String> players;

	public Ipl(String team_name, String captain_name, Map<Integer, String> players) {
		super();
		this.team_name = team_name;
		this.captain_name = captain_name;
		this.players = players;
	}

	@Override
	public String toString() {
		return "Ipl [team_name=" + team_name + ", captain_name=" + captain_name + ", players=" + players + "]";
	}

}
