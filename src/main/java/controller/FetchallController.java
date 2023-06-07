package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ScoreDao;
import dto.ScoreInsertDto;

@WebServlet("/fetchall")
public class FetchallController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		ScoreDao scoreDao = new ScoreDao();
		List<ScoreInsertDto> resultsList = scoreDao.fetchAll();
	
		req.setAttribute("scoreList", resultsList);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchallscore.jsp");
		requestDispatcher.forward(req, resp);

	}
}
