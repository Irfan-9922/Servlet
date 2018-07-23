<%! int pagecount=1;
void addcount(){
pagecount++;
}
%>
<% addcount();%>
<html>

<head>
<title>the include directive example</title>
</head>
<body>
<p>this site hase been visited<%=pagecount %>times</p>
</body>
</html>