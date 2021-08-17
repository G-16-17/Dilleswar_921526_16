package com.cognizant.ormlearn.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.repository.DepartmentRepository;
import com.cognizant.ormlearn.repository.EmployeeRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	private static final Logger LOGGER=null;
	
	@Transactional
    public Department get(int id) {
    LOGGER.info("Start");
	return departmentRepository.findById(id).get();

	}
	
	@Transactional
    public void save(Department department) {
		 LOGGER.info("Start");
	departmentRepository.save(department);

	LOGGER.info("End");

	}

}
