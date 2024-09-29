package com.app.dao;

import com.app.pojos.Employee;
import org.hibernate.*;
import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String addEmployeeDetails(Employee newEmp) {
		String mesg = "Adding emp failed!!!!";
		// 1.Get Session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin Transaction
		Transaction tx = session.beginTransaction();
		try {
			Serializable empId = session.save(newEmp);
			tx.commit();
			mesg = "Added emp details with ID= " + empId;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

}
