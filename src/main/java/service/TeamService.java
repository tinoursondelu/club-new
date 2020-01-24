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
	
	public void addNewTeam(String teamname, List<Booking> bookings, List<Player> players,
			List<Result> results, Club teamClub) {
		Team team = new Team();
		team.setTeamname(teamname);
		team.setBookings(bookings);
		team.setPlayers(players);
		team.setResults(results);
		team.setTeamClub(teamClub);
		td.save(team);
	}
	
	public void RemoveTeam(Team team) {
		td.delete(team);
	}
	
	public Team findTeamById(int id) {
		Team team = td.findById(id);
		return team;
	}
	
	public List<Team> findTeamByClubId(int idClub) {
		return td.findTeamByClubId(idClub);
		
	}

}
