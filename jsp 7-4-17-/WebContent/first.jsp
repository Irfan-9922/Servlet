<%@page import="java.util.Calendar"%>
<%! public String getmsg(String name){
   //get hour of the day
  Calendar cal=Calendar.getInstance();
   int h=cal.get(Calendar.HOUR_OF_DAY);
   //genrate message
   String msg;
   if(h<12)
	  msg="good morning"+name;
   else if(h<20)
	   msg="good evining"+name;
   else
	   msg="good night"+name;
   return msg;
}

%>
<%String name1=request.getParameter("sljd"); %>
<%=getmsg("irfan")%>