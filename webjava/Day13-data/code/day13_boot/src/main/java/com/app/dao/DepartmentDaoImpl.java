package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;
@Repository //mandatory cls level annotation , to tell SC :
//following is a spring bean , containing data access logic.
public class DepartmentDaoImpl implements DepartmentDao {
	//Dependency : javas.persistence.EntityManager
	@Autowired //byType : field level D.I
	//OR : @PersistenceContext
	private EntityManager manager;
	@Override
	public List<Department> listAllDepartments() {
		String jpql="select d from Department d";
		return manager
				.createQuery(jpql,Department.class)
				.getResultList();
	}

}
