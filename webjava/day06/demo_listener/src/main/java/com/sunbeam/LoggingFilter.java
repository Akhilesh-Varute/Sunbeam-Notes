package com.sunbeam;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LoggingFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//pre-processing
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("BEFORE: " + req.getRequestURI());
		// call next component
		chain.doFilter(request, response);
		//post-processing
		System.out.println("AFTER: " + req.getRequestURI());
	}
}




