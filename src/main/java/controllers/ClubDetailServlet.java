package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Club;
import service.ClubService;

@WebServlet("/clubDetail")
public class ClubDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ClubService cs = new ClubService();
       

    public ClubDetailServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("clubId"));
		if (request.getParameter("clubId")!=null) {
			int id = Integer.parseInt(request.getParameter("clubId"));
			Club club = cs.findClubById(id);
			request.setAttribute("club", club);
		}
		request.getRequestDispatcher("WEB-INF/jsp/clubDetail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
