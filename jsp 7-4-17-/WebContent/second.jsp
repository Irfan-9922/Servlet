<%
int a=10;
int b=22;
int c=a+b;
String d=null;

%>

<%! int a=99;
%>
<%=this.a %>
<%! public int m1(int a,int b){
return a+b;
}
%>
<%=m1(12,22)%>