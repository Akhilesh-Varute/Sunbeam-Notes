package com.sunbeam;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class DemoListenerImpl implements ServletContextListener, HttpSessionListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// one time init for whole appln e.g. create connection pool, etc.
		System.out.println("Application Start!!");
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// one time deinit for whole appln e.g. destroy connection pool, etc.
		System.out.println("Application End!!");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		System.out.println("New Session Created: " + session.getId());
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		System.out.println("Session Destroyed: " + session.getId());
	}
}



