package models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Result {

    @Id
    @GeneratedValue
    private int id;
    private LocalDateTime dateMatch;
    private int pointTeam;
    private int pointOpponent;
    @ManyToMany(mappedBy="results")
    private List<Team> teams;
    @ManyToOne
    private Tournament tournament;
    
    //**************** CONSTRUCTORS *****************

  	public Result() {
  		super();
  	}

  	//************  GETTERS & SETTERS ***************
  	
  	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(LocalDateTime dateMatch) {
		this.dateMatch = dateMatch;
	}

	public int getPointTeam() {
		return pointTeam;
	}

	public void setPointTeam(int pointTeam) {
		this.pointTeam = pointTeam;
	}

	public int getPointOpponent() {
		return pointOpponent;
	}

	public void setPointOpponent(int pointOpponent) {
		this.pointOpponent = pointOpponent;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public Tournament getTournament() {
		return tournament;
	}

	public void setTournament(Tournament tournament) {
		this.tournament = tournament;
	}

}
