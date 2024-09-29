package com.sunbeam.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sunbeam.beans.LoginBean;

//@WebFilter("/ctl")
public class SecurityFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("SecurityFilter.init() called...");
	}

	@Override
	public void destroy() {
		System.out.println("SecurityFilter.destroy() called...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("SecurityFilter.doFilter() called...");
		// pre-processing
		LoginBean lb = null;
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String page = req.getParameter("page");
		HttpSession session = req.getSession();
		// allow index and login page for all users
		if((page.equals("index") || page.equals("login"))) {
			chain.doFilter(request, response);
			return;
		}

		// Check if user is authenticated.
		lb = (LoginBean) session.getAttribute("lb");
		if(!(page.equals("index") || page.equals("login"))) {
			if(lb == null || lb.getUser() == null) {
				resp.sendRedirect("/election_mvc/ctl?page=index");
				return;
			}
		}
		if(lb == null) {	
			resp.sendRedirect("/election_mvc/ctl?page=index");
			return;
		}	
		// Check if user is authorized.
		if(lb.getUser().getRole().equals("admin")) {
			if(page.equals("candlist") || page.equals("vote")) {
				resp.sendError(403, "You are admin. Behave like admin.");
				return;
			}
		}
		if(lb.getUser().getRole().equals("voter")) {
			if(page.equals("result") || page.equals("editcand") || page.equals("delcand")) {
				resp.sendError(403, "You are voter. Get lost.");		
				return;
			}
		}
		// invoke next component in chain (FrontController)
		chain.doFilter(request, response);

		// post-processing
	}
}



