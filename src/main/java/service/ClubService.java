package service;

import java.util.List;

import dao.ClubDao;
import models.Category;
import models.Club;
import models.Team;

public class ClubService {
	
	ClubDao cd = new ClubDao();
	
	public void addNewClub(String name, String ville, Category category, List<Team> clubTeams) {
		Club club = new Club();
		System.out.println("club créé");
		club.setName(name);
		club.setVille(ville);
		club.setCategory(category);
		club.setClubTeams(clubTeams);
		cd.save(club);
		System.out.println("club enregistré");
	}
	
	public void removeClub(Club club) {
		cd.delete(club);
	}
	
	public Club findClubById(int id) {
		Club club = cd.findById(id);
		return club;
	}
	
	public List<Club> findAllClubs() {
		List<Club> clubs = cd.findAll();
		return clubs;
	}

}
