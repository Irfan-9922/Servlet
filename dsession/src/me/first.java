package me;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class first extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String s=req.getParameter("name");
		String t=req.getParameter("add");
		String r=req.getParameter("gf");
		System.out.println("from first..................");
		
		System.out.println(s+"......."+t+"......"+r);
		HttpSession ses=req.getSession();
		ses.setAttribute("namo", s);
		ses.setAttribute("mo", t);
		ses.setAttribute("gff", r);
			resp.sendRedirect("secondservlet");
		/*RequestDispatcher rd=req.getRequestDispatcher("secondservlet");
		rd.forward(req, resp);
		*/
	//	resp.sendRedirect("secondservlet");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
