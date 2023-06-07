package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ScoreDao;

@WebServlet("/updatedetail")
public class UpdateDetailController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String rollnumberstring = req.getParameter("rollnumber");
		long rollNumber = Long.parseLong(rollnumberstring);
		String details = req.getParameter("detail");
		String detailschanges = req.getParameter("detailschange");
		
		ScoreDao scoreDao = new ScoreDao();
		String message = scoreDao.updateDetail(rollNumber, details, detailschanges);
		resp.getWriter().print(message);
	}
}
