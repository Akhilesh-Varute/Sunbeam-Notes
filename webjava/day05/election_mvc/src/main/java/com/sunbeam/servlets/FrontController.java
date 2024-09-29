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
			jspPath = "/index.jsp";
		else if(page.equals("login"))
			jspPath = "/login.jsp";
		else if(page.equals("result"))
			jspPath = "/result2.jsp";
		else if(page.equals("editcand"))
			jspPath = "/editcand.jsp";
		else if(page.equals("updatecand"))
			jspPath = "/updatecand.jsp";
		else if(page.equals("delcand"))
			jspPath = "/delcand.jsp";
		else if(page.equals("logout"))
			jspPath = "/logout.jsp";
		else if(page.equals("candlist"))
			jspPath = "/candlist.jsp";
		else if(page.equals("vote"))
			jspPath = "/vote.jsp";
		else 
			jspPath = "/notfound.jsp";
	
		ServletContext ctx = this.getServletContext();
		RequestDispatcher rd = ctx.getRequestDispatcher(jspPath);
		rd.forward(req, resp);
	}
}




