package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Club;
import models.Team;
import service.ClubService;
import service.TeamService;

@WebServlet("/addTeam")
public class AddTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ClubService cs = new ClubService();
	TeamService ts = new TeamService();
       
    public AddTeamServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = (((Club)request.getAttribute("newClub"))).getId();
		List<Team> teams = (List<Team>) ts.findTeamById(id);
		request.setAttribute("teams", teams);
		for (Team t: teams) {
			System.out.println(t.getTeamname());
		}

		request.getRequestDispatcher("WEB-INF/jsp/addTeam.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/addClub"));
	}

}
