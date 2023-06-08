package constructor.collection.Set_Type_dependency;

import java.util.Set;

public class Ipl {
	private String team_name;
	private String captain_name;
	private Set<String> players;

	public Ipl(String team_name, String captain_name, Set<String> players) {
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
