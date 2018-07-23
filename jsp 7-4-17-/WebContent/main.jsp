
<%@include file="header.jsp"%>

<body bgcolor="pink"></body>
<p>welcome to the marrenn land</p>
<%@include file="footer.jsp"%>
<%@page errorPage="error1.jsp" %>
<%int n=Integer.parseInt(request.getParameter("1name")); 
String ad=request.getParameter("add");
 
%>

 
<%=n+""+ad%>
