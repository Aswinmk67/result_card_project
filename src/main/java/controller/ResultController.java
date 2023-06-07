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

@WebServlet("/fetch")
public class ResultController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String rollnumberstring = req.getParameter("rollnumber");
		long rollNumber = Long.parseLong(rollnumberstring);
		String dateOfBirth = req.getParameter("dob");
		
		ScoreDao scoreDao = new ScoreDao();
		ScoreInsertDto studentResult = scoreDao.fetchById(rollNumber);
		
		if(studentResult != null)
		{
			if(dateOfBirth.equals(studentResult.getDate_of_birth()))
			{
				req.setAttribute("requiredResult", studentResult);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
				requestDispatcher.forward(req, resp);
			}
			else
				resp.getWriter().print("incorrect date of birth");
		}
		else
			resp.getWriter().print("incorrect register number");
		
	}
}
