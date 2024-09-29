package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.service.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
	// depcy : service layer i/f
	@Autowired
	private DepartmentService deptService;

	public DepartmentController() {
		System.out.println("in def ctor of " + getClass());
	}

	// URL : http://host:port/ctx_path/departments/list
	// method : GET
	@GetMapping("/list")
	public String listAllDepts(Model modelMap) {
		System.out.println("in list all depts " + modelMap);// {}
		modelMap.addAttribute("dept_list", deptService.getAllDepartments());
		return "/departments/list";
	}
	/*
	 * Handler --> explicitly LVN  ---> D.S 
	 * Implicitly Model attr map is returned.
	 * D.S --> LVN --> V.R ---> AVN :
	 * /WEB-INF/views/departments/list.jsp 
	 * D.S stores model attrs under : request
	 * scope .
	 * D.S --> forwards the request to the JSP based view layer.
	 * 
	 */

}
