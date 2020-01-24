package service;

import java.util.List;

import dao.TeamDao;
import models.Booking;
import models.Club;
import models.Player;
import models.Result;
import models.Team;

public class TeamService {
	
	TeamDao td = new TeamDao();
	
	private void addNewTeam(String teamname, boolean home, List<Booking> bookings, List<Player> players,
			List<Result> results, Club teamClub) {
		Team team = new Team();
		team.setTeamname(teamname);
		team.setHome(home);
		team.setBookings(bookings);
		team.setPlayers(players);
		team.setResults(results);
		team.setTeamClub(teamClub);
		td.save(team);
	}
	
	private void RemoveTeam(Team team) {
		td.delete(team);
	}
	
	private Team findTeamById(int id) {
		Team team = td.findById(id);
		return team;
	}

}
