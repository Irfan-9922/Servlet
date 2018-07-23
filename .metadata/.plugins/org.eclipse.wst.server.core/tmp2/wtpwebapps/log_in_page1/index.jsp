<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body{
 
  background-color:pink;
}

</style>
</head>
<body >
<fieldset>
<legend><center><strong>loginpage</center></strong></legend>
<form action="login" method="post">
USER ID:<input type="text" name="uid" autofocus></br>
PASSWORD:<input type="PASSWORD" name="pass" ></br>
<input type="submit" value="submit">
<a href="register.jsp">REGISTER HRER</a>
<a href="removeRecord.jsp">remove rocord</a>

</fieldset>

</form>
</body>
</html>