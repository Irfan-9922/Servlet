<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='pink'>
<fieldset><legend>REGISTER HERE</legend>
<FORM action="surl" method="get">
<big><marquee>welcome to the biggest universitry of marathwada</marquee></big>
<b><center>personal detail</center></b>

NAME<input TYPE="text" NAME="N"><BR>
LAST NAME<input TYPE="text" NAME="LN"><BR>
FNAME<input TYPE="text" NAME="FN"><BR>

<b><center>EDUCATIONL detail</center></b>
COLLEGE NAME<input TYPE="text" NAME="CN"><BR>
PERCENTAGE<input TYPE="text" NAME="P"><BR>
YEAR OF PASS<input TYPE="text" NAME="YP"><BR>
<b><center>CONTACT  detail</center></b>
PHNO<input TYPE="text" NAME="PH"><BR>
MAIL ADD<input TYPE="text" NAME="MAD"><BR>
<center><input TYPE="submit"VALUE="SUBMIT"></center>
</FORM>
</fieldset>
<%-- <%
if(session.getAttribute("uname")==null)
response.sendRedirect("index.jsp");
else
out.println("welcome");

 %> --%>
</body>
</html>