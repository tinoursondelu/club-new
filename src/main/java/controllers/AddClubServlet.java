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

	ClubService cs = new ClubService();
	

	public AddClubServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Club> clubs = cs.findAllClubs();
		request.setAttribute("clubs", clubs);


		request.getRequestDispatcher("WEB-INF/jsp/addClub.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("debut du post");
//		for (Club club: clubs) {
//			System.out.println("debut boucle servlet");
//			if (club.getName().equals(request.getParameter("name"))) {
//				System.out.println("debut condition=true");
//				return;
//			} else {
				System.out.println("debut condition=false");
				List<Team> team = new ArrayList<Team>();
				cs.addNewClub(request.getParameter("name"),
						request.getParameter("ville"),
						Category.valueOf(request.getParameter("category")),
						team);
				System.out.println("envois au service");
//			}
//		}

		response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/addClub"));
//		request.getRequestDispatcher("WEB-INF/jsp/addClub.jsp").forward(request, response);
	}

}
