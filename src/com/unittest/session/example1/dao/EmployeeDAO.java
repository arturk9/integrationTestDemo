package com.unittest.session.example1.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.unittest.session.example1.domain.Employee;

@Transactional(propagation = Propagation.REQUIRED)
public interface EmployeeDAO {

	public Long createEmployee(Employee emp);
	
	public Employee getEmployeeById(Long id);
}
