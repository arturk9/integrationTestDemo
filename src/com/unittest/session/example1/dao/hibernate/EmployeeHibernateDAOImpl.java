package com.unittest.session.example1.dao.hibernate;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.unittest.session.example1.dao.EmployeeDAO;
import com.unittest.session.example1.domain.Employee;

public class EmployeeHibernateDAOImpl extends HibernateDaoSupport implements
		EmployeeDAO {

	@Override
	public Long createEmployee(Employee emp) {
		getHibernateTemplate().persist(emp);
		return emp.getEmpId();
	}

	public Employee getEmployeeById(Long id) {
		return getHibernateTemplate().get(Employee.class, id);
	}
}
