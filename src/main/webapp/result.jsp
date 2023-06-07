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
	<%ScoreInsertDto dto = (ScoreInsertDto) request.getAttribute("requiredResult"); %>
	
	<nav style="height: 75px;width: 100%; background-color: orange;">
       <center>
        <p style="font-size: 5px; color: orange;">Space</p>
        <span><b style="font-size: 22px; color: aliceblue; font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;">Karnataka School Examination and Assessment Board</b></span><br>
        <p style="font-size: 5px; color: orange;">Space</p>
        <span style="font-size: 16px; color: aliceblue; font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;">(SSLC Main Examination Results - 2023)</span>
       </center>
    </nav>
    
    <div style="height: 70px; width: 100%;">
    	<div style="display: flex; justify-content: space-between;">
    		<span><b>Register number : <%=dto.getRoll_number() %></b></span>
    		<span><b>Name : <%=dto.getStudent_name() %></b></span>
    		<span><b>Date of Birth : <%=dto.getDate_of_birth() %></b></span>
    	</div>
    	<div style="display: flex; justify-content: space-between;">
    		<span><b>Father name : <%=dto.getFather_name() %></b></span>
    		<span><b>Mother name : <%=dto.getMother_name() %></b></span>
    	</div>
    </div>
    
    <div>
    	<center>
    		<table border="">
    			<tr>
    				<th>Subject</th>
    				<th>Marks</th>
    			</tr>
    			<tr>
    				<td>Kannada</td>
    				<td><%=dto.getKannada() %></td>
    			</tr>
    			<tr>
    				<td>English</td>
    				<td><%=dto.getEnglish() %></td>
    			</tr>
    			<tr>
    				<td>Hindi</td>
    				<td><%=dto.getHindi() %></td>
    			</tr>
    			<tr>
    				<td>Maths</td>
    				<td><%=dto.getMaths() %></td>
    			</tr>
    			<tr>
    				<td>Social</td>
    				<td><%=dto.getSocial() %></td>
    			</tr>
    			<tr>
    				<td>Science</td>
    				<td><%=dto.getScience() %></td>
    			</tr>
    		</table>
    		
   			<span><b>Total marks : <%=dto.getTotal_matks() %></b></span><br>
   			<span><b>Percentage : <%=dto.getPercentage() %></b></span><br>
   			
   			<button type="button"><a href="results.html">Home</a></button>
   			<button type="reset">Print</button>
    	</center>
    </div>
    
    <nav style="height: 50px; width: 100%; background-color: black; color: gray;font-size: 11.6667px;">
        <span>Disclaimer: Neither NIC  nor KSEAB, Karnataka is responsible for any inadvertent error that may have crept in the results being published on NET. The results published on net are for immediate information to the examinees. These cannot be treated as original mark sheets.</span><br>
        <p style="font-size: 4px; color: black;">Space</p>
        <div style="display: flex; justify-content: space-between;">
        <span>Best viewed in IE 9.0 and above and Chrome and Mozilla Firefox</span>
        <span>Content owned, maintained & updated by KSEAB.</span>
        <span>Designed, Developed & Hosted by National Informatics Centre, Karnataka</span>
        </div>
    </nav>
    
</body>
</html>