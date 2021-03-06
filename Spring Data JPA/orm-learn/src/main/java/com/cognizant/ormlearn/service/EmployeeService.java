package com.cognizant.ormlearn.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;

import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	private static final Logger LOGGER=null;
	
	@Transactional
    public Employee get(int id) {
    LOGGER.info("Start");
	return employeeRepository.findById(id).get();

	}
	
	@Transactional
	public Employee set(int id) {
		LOGGER.info("Start");
		return employeeRepository.findById(id).get();
	}
	
	@Transactional
    public void save(Employee employee) {
		 LOGGER.info("Start");
	employeeRepository.save(employee);

	LOGGER.info("End");

	}

}
