package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    @ManyToMany
    private List<Team> playerTeams;
    
  //**************** CONSTRUCTORS *****************

  	public Player() {
  		super();
  	}

  	//************  GETTERS & SETTERS ***************
  	
  	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Team> getPlayerTeams() {
		return playerTeams;
	}

	public void setPlayerTeams(List<Team> playerTeams) {
		this.playerTeams = playerTeams;
	}
  	

}
