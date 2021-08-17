package com.cognizant.ormlearn.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.repository.EmployeeRepository;
import com.cognizant.ormlearn.repository.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	SkillRepository skillRepository;
	private static final Logger LOGGER=null;
	
	@Transactional
    public Skill get(int id) {
    LOGGER.info("Start");
	return skillRepository.findById(id).get();

	}
	
	@Transactional
    public void save(Skill skill) {
		 LOGGER.info("Start");
	skillRepository.save(skill);

	LOGGER.info("End");

	}

}
