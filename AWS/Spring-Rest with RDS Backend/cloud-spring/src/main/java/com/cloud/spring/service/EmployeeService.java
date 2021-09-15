package com.cloud.spring.service;

import java.util.List;

import com.cloud.spring.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	String addEmployee(Employee employee);

}
