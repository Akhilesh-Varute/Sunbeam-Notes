package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	//depcy : 
	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmpsByDeptId(Long deptId) {
		// TODO Auto-generated method stub
		return empDao.findByDeptId(deptId);
	}

	@Override
	public String deleteEmpDetails(Long empId) {
		if(empDao.existsById(empId))
		{
			empDao.deleteById(empId);
			return "Emp details deleted.....";
		}
		return "Deletion of emp details failed!!!!!";
	}

	@Override
	public String updateSalary(Long empId, double salary) {
		//get emp details by id
		Employee emp=empDao.findById(empId).orElseThrow();
		//emp : persistent
		emp.setSalary(salary);
		return "emp salary updated ....";
	}
	
	
	

}
