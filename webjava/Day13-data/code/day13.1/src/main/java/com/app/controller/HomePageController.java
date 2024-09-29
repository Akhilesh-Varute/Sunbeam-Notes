package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	public HomePageController() {
		System.out.println("in def ctor of " + getClass());
	}

	// URL : http://host:port/ctx_path/
	@RequestMapping("/")
	public String renderHomePage() {
		System.out.println("in render hm page");
		return "/index";// Handler ---> LVN --> D.S --> V.R
		//--> AVN
		// AVN : /WEB-INF/views/index.jsp --> 
		//D.S forwards the clnt to the JSP
	}

}
