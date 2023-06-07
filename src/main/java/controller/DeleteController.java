package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SchoolDao;
import dao.ScoreDao;

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String rollnumberstring = req.getParameter("rollnumber");
		long rollNumber = Long.parseLong(rollnumberstring);
		
		ScoreDao scoreDao = new ScoreDao();
		String userMessage = scoreDao.deleteById(rollNumber);
		
		resp.getWriter().print(userMessage);
	}
}
