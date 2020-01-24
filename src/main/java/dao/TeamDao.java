package dao;

import java.util.List;

import org.hibernate.Session;

import models.Team;
import utils.HibernateUtil;

public class TeamDao extends GenericDao<Team> {
	
	public TeamDao() {
		super(Team.class);
	}
	
	public List<Team> findTeamByClubId(int idClub, Session s) {
		return (List<Team>) s.createQuery("from Team where teamClub_id = :idClub") 
			.setParameter("idClub", idClub)
			.uniqueResult();
		
	}
	
	public List<Team> findTeamByClubId(int idClub) {
		Session s = HibernateUtil.getSessionFactory().openSession();
			List<Team> t = findTeamByClubId(idClub, s);
			s.close();
			return t;
		
	}
	


}
