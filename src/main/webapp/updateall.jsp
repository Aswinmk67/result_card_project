<%@page import="dto.ScoreInsertDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ScoreInsertDto detail=(ScoreInsertDto)request.getAttribute("details"); %>

<nav>
        <img src="KSEAB.jpg" style="width: 100%;" alt="" srcset="">
</nav>

<div style="height: 500px;width: 100%;">
	<center>
	<form action="update" method="post">
	<table>
		<tr>
			<td><b>Register number : </b></td>
			<td><input type="number" name="rollnumber" value="<%=detail.getRoll_number()%>" readonly="readonly"></td>
		</tr>
		<tr>
			<td><b>Student name : </b></td>
			<td><input type="text" name="studentname" value="<%=detail.getStudent_name()%>"></td>
		</tr>
		<tr>
			<td><b>Date Of Birth : </b></td>
			<td><input type="date" name="dob" value="<%=detail.getDate_of_birth()%>"></td>
		</tr>
		<tr>
			<td><b>Father name : </b></td>
			<td><input type="text" name="fathername" value="<%=detail.getFather_name()%>"></td>
		</tr>
		<tr>
			<td><b>Mother name : </b></td>
			<td><input type="text" name="mothername" value="<%=detail.getMother_name()%>"></td>
		</tr>
		<tr>
			<td><b>Kannada : </b></td>
			<td><input type="number" name="Kannada" value="<%=detail.getKannada()%>"></td>
		</tr>
		<tr>
			<td><b>English : </b></td>
			<td><input type="number" name="English" value="<%=detail.getEnglish()%>"></td>
		</tr>
		<tr>
			<td><b>Hindi : </b></td>
			<td><input type="number" name="Hindi" value="<%=detail.getHindi()%>"></td>
		</tr>
		<tr>
			<td><b>Maths : </b></td>
			<td><input type="number" name="Maths" value="<%=detail.getMaths()%>"></td>
		</tr>
		<tr>
			<td><b>Social : </b></td>
			<td><input type="number" name="Social" value="<%=detail.getSocial()%>"></td>
		</tr>
		<tr>
			<td><b>Science : </b></td>
			<td><input type="number" name="Science" value="<%=detail.getScience()%>"></td>
		</tr>
	</table>
	<button type="submit">modify</button>
	<button type="reset">cancel</button>
	</form>
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