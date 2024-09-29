package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // mandatory
@RequestMapping("/test") // optional BUT recommended
//for the reusable base pattern
public class TestController {
	public TestController() {
		System.out.println("in ctor " + getClass());
	}
	//URL : http://host:port/ctx/test/test1
	@GetMapping("/test1") //=@RequestMapping(method=GET)
	//In HandlerMapping bean
	//key : /test/test1
	//value : com.app.controller.TestController.testModelAndView
	public ModelAndView testModelAndView() {
		System.out.println("in test m n v");
		//o.s.w.s.ModelAndView(String LVN , String modelAttrName,
		//Object modelAttrVal)
		return new ModelAndView("/test/test1", "server_ts", 
				LocalDateTime.now());
	}
	/*
	 * Handler rets MnV --> D.S
	 * D.S --> LVN --> V.R --> AVN : /WEB-INF/views/test/test1.jsp
	 * D.S --> adds model attrs (results) under request scope
	 * forwards the clnt to the JSP based view Layer.
	 */
}
