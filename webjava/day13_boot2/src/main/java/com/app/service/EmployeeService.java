package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {

	List<Employee> getAllEmpsByDeptId(Long deptId);

	String deleteEmpDetails(Long empId);

}
