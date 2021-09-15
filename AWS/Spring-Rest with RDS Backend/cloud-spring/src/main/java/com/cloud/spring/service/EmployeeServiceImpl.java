package com.cloud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.spring.model.Employee;
import com.cloud.spring.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return "Employee with the id"+employee.getId()+"added successfully";
	}
	

}
