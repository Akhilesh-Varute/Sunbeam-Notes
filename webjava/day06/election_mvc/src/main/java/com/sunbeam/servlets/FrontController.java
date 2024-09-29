package com.sunbeam.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ctl") // TODO: declare in web.xml instead of @WebServlet
public class FrontController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page = req.getParameter("page");
		String jspPath = "";
		if(page.equals("index"))
			jspPath = "/WEB-INF/views/index.jsp";
		else if(page.equals("login"))
			jspPath = "/WEB-INF/views/login.jsp";
		else if(page.equals("result"))
			jspPath = "/WEB-INF/views/result2.jsp";
		else if(page.equals("editcand"))
			jspPath = "/WEB-INF/views/editcand.jsp";
		else if(page.equals("updatecand"))
			jspPath = "/WEB-INF/views/updatecand.jsp";
		else if(page.equals("delcand"))
			jspPath = "/WEB-INF/views/delcand.jsp";
		else if(page.equals("logout"))
			jspPath = "/WEB-INF/views/logout.jsp";
		else if(page.equals("candlist"))
			jspPath = "/WEB-INF/views/candlist.jsp";
		else if(page.equals("vote"))
			jspPath = "/WEB-INF/views/vote.jsp";
		else if(page.equals("announcement"))
			jspPath = "/WEB-INF/views/announcement.jsp";
		else if(page.equals("announce"))
			jspPath = "/WEB-INF/views/announce.jsp";
		else 
			jspPath = "/WEB-INF/views/notfound.jsp";
	
		ServletContext ctx = this.getServletContext();
		RequestDispatcher rd = ctx.getRequestDispatcher(jspPath);
		rd.forward(req, resp);
	}
}




