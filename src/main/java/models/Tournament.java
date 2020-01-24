package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Tournament {

    @Id
    @GeneratedValue
    private int id;
    @OneToMany(mappedBy="tournament")
    private List<Result> tournamentResults;
    
    //**************** CONSTRUCTORS *****************

  	public Tournament() {
  		super();
  	}

  	//************  GETTERS & SETTERS ***************
  	
  	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Result> getTournamentResults() {
		return tournamentResults;
	}

	public void setTournamentResults(List<Result> tournamentResults) {
		this.tournamentResults = tournamentResults;
	}


}
