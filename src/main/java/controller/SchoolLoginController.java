package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SchoolDao;
import dto.SchoolInsertDto;

@WebServlet("/loginschool")
public class SchoolLoginController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		
		SchoolDao schoolDao = new SchoolDao();
		SchoolInsertDto schoolInsertDto = schoolDao.login(userName);
		
		if(schoolInsertDto != null)
		{
			if(passWord.equals(schoolInsertDto.getPassword()))
			{
				req.setAttribute("schooldetails", schoolInsertDto);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("homepage.jsp");
				requestDispatcher.forward(req, resp);
			}
			else
				resp.getWriter().print("Invalid password");
		}
		else
			resp.getWriter().print("Invalid username");
	}
}
