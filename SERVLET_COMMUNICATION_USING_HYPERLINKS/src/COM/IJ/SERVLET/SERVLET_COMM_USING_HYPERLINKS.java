package COM.IJ.SERVLET;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SERVLET_COMM_USING_HYPERLINKS extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//genral settings
	PrintWriter pw=resp.getWriter();
	resp.setContentType("text/html");
	//get system date and time
	Calendar cl=Calendar.getInstance();
	int h=cl.get(Calendar.HOUR_OF_DAY);
	//genrate wish message
	if(h<=12)
	{
		pw.println("<marquee><color='red'>goodmorning</marquee>");
	}
	else if(h<=16)
	{
		pw.println("<h4><font color='green'>godd after noon</h4>");
		
	}
	else if(h<=20)
	{
		pw.println("<h4><font color='green'>godd evining</h4>");
		
	}
	else
	{
		pw.println("<h4><font color='green'>godd night</h4>");
		
	}
	//pw.println("<a href='");
	}

}
