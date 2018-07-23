package com.nt;


public class DateSrv extends GenericServlet{
	
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		//set content type
		res.setContentType("text/html");
		//GET PRINT WRITER OBJECT
					PrintWriter pw=res.getWriter();
					Date d=new Date();
					pw.println("<b><i><center>date and time is "+d+"</b></i></center>");
					pw.println("<b><i><center>Shaikh irfan jalil</b></i></center>");
					pw.println("<b><i><center>Shaikh irfan jalil</b></i></center>");
					pw.println("<b><i><center>Shaikh irfan jalil</b></i></center>");
				//	pw.println("<marquee><b><i><center>Shaikh irfan jalil</b></i></center></marquee>");
					pw.close();
	}


		
		
		
		
	}
	


