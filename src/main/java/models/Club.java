package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Club {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String ville;
	@Enumerated(EnumType.STRING)
	private Category category;
	@OneToMany(mappedBy="teamClub")
	private List<Team> clubTeams;
	
//**************** CONSTRUCTORS *****************
	
	public Club() {
		super();
	}
	
//************  GETTERS & SETTERS ***************
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Team> getClubTeams() {
		return clubTeams;
	}

	public void setClubTeams(List<Team> clubTeams) {
		this.clubTeams = clubTeams;
	}
	
	
	
	

}
