package foll;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*import welcome.HttpServlet;
import welcome.HttpServletRequest;
import welcome.HttpServletResponce;
import welcome.ServletException;*/

public class Wishsrv extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("html/text");
		Calendar cl=Calendar.getInstance();
		int h=cl.get(Calendar.HOUR_OF_DAY);
		if(h<=12)
		pw.println("<h1><font color ='green'>good morning</font></h1>");
		else if(h<=16)
		
		pw.println("<h1><font color ='pink'>good afternoon</font></h1>");
		else if(h<=20)
			
			pw.println("<h1><font color ='white'>good evining</font></h1>");
		else
			pw.println("<h1><font color ='red'>good night</font></h1>");
		pw.println("<a href='http://localhost:3030/Wishapp/page.html'>home</a>");
		//pw.print("<a href='page.html'</a>");
		pw.close();
	}

}
