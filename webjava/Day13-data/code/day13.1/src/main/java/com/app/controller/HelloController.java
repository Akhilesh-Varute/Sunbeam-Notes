package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//mandatory cls level annot to tell SC , 
//following is a spring bean , having req handling methods
//singleton n eager
public class HelloController {
	public HelloController() {
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to display welcome mesg
	@RequestMapping ("/hello") //mandatory method level anno 
	//to intercept ANY HTTP request(get|post|put|.....)
	public String sayHello() {
		System.out.println("in say hello");
		//ret LVN(Logical view name) to D.S(DispatcherServlet)
		//--> to be reolved by V.R(ViewResolver)
		return "/welcome";//AVN : /WEB-INF/views/welcome.jsp
	}

}
