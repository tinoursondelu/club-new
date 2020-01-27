package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Category;
import models.Club;
import models.Team;
import service.ClubService;

@WebServlet("/addClub")
public class AddClubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ClubService clubService = new ClubService();


	public AddClubServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Club> clubs = clubService.findAll();
		request.setAttribute("clubs", clubs);
		request.getRequestDispatcher("WEB-INF/jsp/addClub.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Club> clubs = clubService.findAll();
		Club Club = new Club();
		if (clubService.verifIfExistAndNN(request.getParameter("name"), request.getParameter("ville"))) {
			Club = clubService.add(request.getParameter("name"),
					request.getParameter("ville"),
					Category.valueOf(request.getParameter("category")));
			request.setAttribute("Club", Club);
			request.getRequestDispatcher("WEB-INF/jsp/addTeam.jsp").forward(request, response);
		} else {
			response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/addClub"));
		}
	}

}
