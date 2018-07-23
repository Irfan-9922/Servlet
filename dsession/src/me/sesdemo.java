package me;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sesdemo extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession ss=req.getSession(false);
		String name=(String) ss.getAttribute("namo");
		//String ss=req.getParameter("age");
		String t=req.getParameter("add");
		String j=(String) ss.getAttribute("mo");
		String ff=(String) ss.getAttribute("gff");
		
		System.out.println("from second");
		System.out.println(name+"....."+t+"..."+j+"....");
        resp.sendRedirect("third");
     

	

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
