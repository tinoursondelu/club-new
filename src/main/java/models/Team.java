package models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private int id;
	private String teamname;
	@ManyToMany(mappedBy="playerTeams")
	private List<Player> players;
	@OneToMany(mappedBy="bookingTeam")
	private List<Booking> bookings;
	@ManyToOne
	private Club teamClub;
	@ManyToMany
	private List<Result> results;

	//**************** CONSTRUCTORS *****************

	public Team() {
		super();
	}

	//************  GETTERS & SETTERS ***************



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Club getTeamClub() {
		return teamClub;
	}

	public void setTeamClub(Club teamClub) {
		this.teamClub = teamClub;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

}
