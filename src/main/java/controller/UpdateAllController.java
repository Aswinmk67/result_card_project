package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ScoreDao;
import dto.ScoreInsertDto;

@WebServlet("/updateall")
public class UpdateAllController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String rollnumberstring = req.getParameter("rollnumber");
		long rollNumber = Long.parseLong(rollnumberstring);
		
		ScoreDao scoreDao = new ScoreDao();
		ScoreInsertDto scoreInsertDto = scoreDao.fetchById(rollNumber);
		
		req.setAttribute("details", scoreInsertDto);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateall.jsp");
		requestDispatcher.forward(req, resp);
	}
}
