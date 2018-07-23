package firstServletprogram;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		//genaral settingds
		PrintWriter pw =res.getWriter();
		res.setContentType("text/html");
		//prossesing the date 
		Date d=new Date();
		pw.println("<center><i>today date is "+d+"</center></i>");
		String name=req.getParameter("name");
		String sage=req.getParameter("age");
		int s=Integer.parseInt(sage);
		
	/*	String sage=req.getParameter("age").trim();
		int s=Integer.parseInt(sage);
		if(s>=18)
			pw.println("<center>you are younger "+sage+"</center>");
		else*/
		if(s>=18)
			//pw.println("<center>you are younger "+sage+"</center>");
			//pw.println("<center>you are "+sage+"</center>");
			pw.println("<center>"+name+" you are elligeble for vot</center>");
		else
		pw.println("<center>"+name+" you are  not elligeble for vot</center>");
		pw.println("<a href='NewFile.html'><img src='a.jpeg'></a>");
		pw.close();
		
	}

}
