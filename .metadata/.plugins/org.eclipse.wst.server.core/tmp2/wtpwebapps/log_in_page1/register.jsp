<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color:lightgreen;

}
button{
color:pink;
}
vr{
display:block;
width:10px;
background-color:#000;
}
submit{

background-color:red;
}





</style>
<div><style background-color:'red'>wecome to the world</style></div>
</head>


<body>
<form action="register" method="post">
User Name:<center><input type="text" name="name"><br></center>
<hr>
Email: <center><input type="text" name="email"><br></center>
<hr>
Password:<center><input type="password" name="pass1"><br></center>
<hr>
Retype password:<center><input type="password" name="pass2"><br></center>
<hr>
First Name:<center><input type="text" name="first_name"><br></center>
<hr>
Last Name:<center><input type="text" name="last_name"><br></center>
<hr>
Phno:<center><input type="text" name="phno"><br></center>
<hr>
Street:<center><input type="text" name="street"><br></center>
<hr>
City:<center><input type="text" name="city"><br></center>
<hr>
Zipcode:<center><input type="text" name="zipcode"><br></center>
<hr>
Countery:<center><input type="text"name="countery"><br></center>
<hr>

<center><input type="submit" style="background-color:red" value="submit"></center>
</form>
</body>
</html>