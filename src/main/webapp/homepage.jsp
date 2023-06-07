<%@page import="dto.SchoolInsertDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%SchoolInsertDto schoolInsertDto = (SchoolInsertDto)request.getAttribute("schooldetails"); %>
	<nav>
        <img src="KSEAB.jpg" style="width: 100%;" alt="" srcset="">
    </nav>
    
    <div style="height: 450px; width: 100%;">
    	<center>
    		<span><b>School name : <%=schoolInsertDto.getSchoolname() %></b></span><br>	
    	</center>
    	<div style="display: flex; justify-content: space-between;">
    	
    		<div style="border: 2px solid black; height: 180px; width: 203px;background-color: #E0F3FA">
    			<b>Fetch all : </b><a href="fetchall">click here</a><br>
    			<p style="font-size: 8px;color: #E0F3FA">Space</p>
    			<b>Update all details : </b><br>
    			<form action="updateall" method="post">
    				Roll number : <input type="number" name="rollnumber">
    				<button type="submit">go</button>
    			</form>
    		</div>
    		
    		<div style="border: 2px solid black; height: 180px; width: 203px;background-color: #88D2EF;">
    			<fieldset style="border: 1px solid #88D2EF;">
    				<legend>Update subject mark :</legend>
    				<form action="updatesubject" method="post">
						Roll number : <input type="number" name="rollnumber"><br>
        				<span>Subjects : </span>
        				<span>
            				<select name="subject" id="">
               					<option value="">select</option>
                				<option value="kannada">Kannada</option>
                				<option value="english">English</option>
                				<option value="hindi">Hindi</option>
                				<option value="maths">Maths</option>
                				<option value="social">Social</option>
                				<option value="science">Science</option>
            				</select>
        				</span><br>
        				Marks : <input type="number" name="subjectmark"><br>
        				<button type="submit">submit</button>
   					 </form>
    			</fieldset>
    		</div>
    		
    		<div style="border: 2px solid black; height: 180px; width: 203px;background-color: #54BBE6;">
    			<fieldset style="border: 1px solid #54BBE6;">
    				<legend>Update student detail :</legend>
    				<form action="updatedetail" method="post">
					Roll number : <input type="number" name="rollnumber"><br>
					<span>Student details : </span>
        			<span>
            			<select name="detail" id="">
                			<option value="">select</option>
                			<option value="studentname">Name</option>
                			<option value="dob">Date of Birth</option>
                			<option value="fathername">Father name</option>
                			<option value="mothername">Mother name</option>
            			</select>
        			</span><br>
        			Detail : <input type="text" name="detailschange"><br>
        			<button type="submit">submit</button>
					</form>
    			</fieldset>
    		</div>
    		
    		<div style="border: 2px solid black; height: 180px; width: 203px;background-color: #37A4DB;">
    			<center>
    				<fieldset style="border: 1px solid #37A4DB;">
    					<legend>Delete</legend>
    					<form action="delete">
    						<p>Enter Roll number to be deleted : </p><br>
    						<input type="number" name="rollnumber"><br>
    						<button type="submit">submit</button>
    					</form>	
    				</fieldset>
    			</center>
    		</div>
    		
    	</div>
    </div>
    
    <div>
    	<center>
    		To add Student : <a href="insertsc.html">click here</a>
    	</center>
    </div>
    
    <div>
    	<center>
    		<button type="button"><a href="schoollogin.html">Home</a></button>
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