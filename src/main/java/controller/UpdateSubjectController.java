package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ScoreDao;

@WebServlet("/updatesubject")
public class UpdateSubjectController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String rollnumberstring = req.getParameter("rollnumber");
		long rollNumber = Long.parseLong(rollnumberstring);
		String subjects = req.getParameter("subject");
		String subjectmarks = req.getParameter("subjectmark");
		int mark = Integer.parseInt(subjectmarks);
		
		ScoreDao scoreDao = new ScoreDao();
		String message = scoreDao.updateSubject(rollNumber, subjects, mark);
		resp.getWriter().print(message);
	}
}
