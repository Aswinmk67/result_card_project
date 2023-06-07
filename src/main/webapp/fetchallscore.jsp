<%@page import="dto.ScoreInsertDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<ScoreInsertDto> resultList=(List<ScoreInsertDto>)request.getAttribute("scoreList"); %>
<nav>
    <img src="KSEAB.jpg" style="width: 100%;" alt="" srcset="">
</nav>

<div style="height: 500px; width: 100%">
	<center>
		<table border="">
	<tr>
		<th>Roll Number</th>
		<th>Student Name</th>
		<th>Date Of Birth</th>
		<th>Father Name</th>
		<th>Mother Name</th>
		<th>Kannada</th>
		<th>English</th>
		<th>Hindi</th>
		<th>Maths</th>
		<th>Social</th>
		<th>Science</th>
		<th>Total Marks</th>
		<th>Percentage</th>
	</tr>
	<%for(ScoreInsertDto scoreInsertDto : resultList){ %>
	<tr>
		<td><%=scoreInsertDto.getRoll_number() %></td>
		<td><%=scoreInsertDto.getStudent_name() %></td>
		<td><%=scoreInsertDto.getDate_of_birth() %></td>
		<td><%=scoreInsertDto.getFather_name() %></td>
		<td><%=scoreInsertDto.getMother_name() %></td>
		<td><%=scoreInsertDto.getKannada() %></td>
		<td><%=scoreInsertDto.getEnglish() %></td>
		<td><%=scoreInsertDto.getHindi() %></td>
		<td><%=scoreInsertDto.getMaths() %></td>
		<td><%=scoreInsertDto.getSocial() %></td>
		<td><%=scoreInsertDto.getScience() %></td>
		<td><%=scoreInsertDto.getTotal_matks() %></td>
		<td><%=scoreInsertDto.getPercentage() %></td>
	</tr>
	<%} %>
</table>
	</center>
</div>

<div style="display: flex;justify-content: space-between;">
        <div>
            <span>@Designed and Developed by KSEAB with the guidance of National Informatics Centre</span>
            <br>
            <img src="nic.png" alt="" srcset="">
        </div>
        <div>
            <span>@Content Owned & Maintained By</span><br>
            <span>Karnataka School Examination and Assessment Board,</span><br>            
            <span>6th Cross, Malleshwaram, Bengaluru 560003 Phone: +91-80-23349434</span>
        </div>
    </div>

</body>
</html>