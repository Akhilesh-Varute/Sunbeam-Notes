package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.EmployeeService;

@Controller
@RequestMapping("/emps")
public class EmployeeController {
	// dep : emp service i/f
	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		System.out.println("in def ctor " + getClass());
	}

	/*
	 * http://localhost:8080/day13_boot/emps/list payload : deptId=1 , method=POST
	 */
	@RequestMapping("/list") // @PostMapping=@RequestMpping(method=POST)
	public String listEmpsByDept(Model map, @RequestParam Long deptId, HttpSession session)
	// Long deptId=Long.parseLong(request.getParameter("deptId")
	// MUST match : req param name to method arg name
	{
		System.out.println("in list emps " + deptId);
		session.setAttribute("dept_id", deptId);
		// invoke service method
		map.addAttribute("emp_list", empService.getAllEmpsByDeptId(deptId));
		return "/emps/list";// AVN : /WEB-INF/views/emps/list.jsp
	}

	// http://localhost:8080/day13_boot/emps/delete?empId=1
	// method=GET
	@GetMapping("/delete")
	public String deleteEmpDetails(@RequestParam Long empId, Model map, HttpSession session) {
		System.out.println("in del emp details " + empId);
		Long deptId = (Long) session.getAttribute("dept_id");
		map.addAttribute("mesg", empService.deleteEmpDetails(empId));
		return "redirect:/emps/list?deptId=" + deptId;
	}

	// http://localhost:8080/day13_boot/emps/update?empId=1
	// method=GET
	// show update form
	@GetMapping("/update")
	public String updateEmpDetails(@RequestParam Long empId) {
		System.out.println("in update emp details " + empId);
		return "/emps/update";
	}

	// http://localhost:8080/day13_boot/emps/update?empId=1
	// method=POST
	// process update form
	@PostMapping("/update")
	public String processUpdateEmpDetails(@RequestParam Long empId, @RequestParam double salary, HttpSession session) {
		System.out.println("in update emp details " + empId + " " + salary);
		session.setAttribute("mesg", empService.updateSalary(empId, salary));
		Long deptId = (Long) session.getAttribute("dept_id");
		return "redirect:/emps/list?deptId=" + deptId;
	}
}
