package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SchoolDao;
import dto.SchoolInsertDto;

@WebServlet("/insertschool")
public class InsertionSchoolController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String userName = req.getParameter("username");
		String schoolName = req.getParameter("schoolname");
		String passWord = req.getParameter("password");
		
		SchoolInsertDto schoolInsertDto = new SchoolInsertDto();
		schoolInsertDto.setUsername(userName);	
		schoolInsertDto.setSchoolname(schoolName);
		schoolInsertDto.setPassword(passWord);
		
		SchoolDao schoolDao = new SchoolDao();
		String message = schoolDao.insert(schoolInsertDto);
		
		resp.getWriter().print(message);
	}
}
