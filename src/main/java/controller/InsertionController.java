package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ScoreDao;
import dto.ScoreInsertDto;

@WebServlet("/insert")
public class InsertionController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String rollnumberstring = req.getParameter("rollnumber");
		long rollNumber = Long.parseLong(rollnumberstring);
		String studentName = req.getParameter("studentname");
		String dateOfBirth = req.getParameter("dob");
		String fatherName = req.getParameter("fathername");
		String motherName = req.getParameter("mothername");
		String kannadastring = req.getParameter("Kannada");
		int kannada = Integer.parseInt(kannadastring);
		String englishstring = req.getParameter("English");
		int english = Integer.parseInt(englishstring);
		String hindistring = req.getParameter("Hindi");
		int hindi = Integer.parseInt(hindistring);
		String mathsstring = req.getParameter("Maths");
		int maths = Integer.parseInt(mathsstring);
		String socialstring = req.getParameter("Social");
		int social = Integer.parseInt(socialstring);
		String sciencestring = req.getParameter("Science");
		int science = Integer.parseInt(sciencestring);
		
		int total = kannada+english+hindi+maths+social+science;
		double percentage = (total*100)/600;
		
		ScoreInsertDto dto = new ScoreInsertDto();
		dto.setRoll_number(rollNumber);
		dto.setStudent_name(studentName);
		dto.setDate_of_birth(dateOfBirth);
		dto.setFather_name(fatherName);
		dto.setMother_name(motherName);
		dto.setKannada(kannada);
		dto.setEnglish(english);
		dto.setHindi(hindi);
		dto.setMaths(maths);
		dto.setSocial(social);
		dto.setScience(science);
		dto.setTotal_matks(total);
		dto.setPercentage(percentage);
		
		ScoreDao dao = new ScoreDao();
		String message = dao.insert(dto);
		
		resp.getWriter().print(message);

		//System.out.println(rollNumber+" "+studentName+" "+dateOfBirth+" "+fatherName+" "+motherName);
		//System.out.println(kannada+" "+english+" "+hindi+" "+maths+" "+social+" "+science);
		//System.out.println(total+" "+percentage);
		
		//System.out.println(dto);
	}
}
