package service;

import java.util.List;

import dao.ClubDao;
import models.Category;
import models.Club;
import models.Team;

public class ClubService {

	ClubDao cd = new ClubDao();

	public Club add(String name, String ville, Category category) {
		Club club = new Club();
		System.out.println("club créé");
		club.setName(name);
		club.setVille(ville);
		club.setCategory(category);
		cd.save(club);
		System.out.println("club enregistré");
		return club;
	}

	public void remove(Club club) {
		cd.delete(club);
	}

	public Club findById(int id) {
		Club club = cd.findById(id);
		return club;
	}

	public List<Club> findAll() {
		List<Club> clubs = cd.findAll();
		return clubs;
	}

	public boolean verifIfExistAndNN(String name, String ville) {
		boolean verif = true;
		List<Club> clubs = findAll();
		for (Club club: clubs) {
			if (club.getName().equals(name) || name.isBlank() || ville.isBlank())
				verif = false;
		}
		return verif;
	}

}
