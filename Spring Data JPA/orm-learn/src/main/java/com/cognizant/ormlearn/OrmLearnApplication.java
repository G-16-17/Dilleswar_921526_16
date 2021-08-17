package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	// private static StockService stockService;
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;

public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Application Started.....");
	    employeeService=context.getBean(EmployeeService.class);
	    departmentService=context.getBean(DepartmentService.class);
	    skillService=context.getBean(SkillService.class);
	    
	   // testGetEmployee();
		testAddEmployee();
	 	

	  }


        public static void testGetEmployee() {

          LOGGER.info("Start");

          Employee employee = employeeService.get(1);

         LOGGER.debug("Employee:{}", employee);

        LOGGER.debug("Department:{}", employee.getDepartment());

          LOGGER.info("End");

}
        
        public static void testAddEmployee() {

            LOGGER.info("Start");
            Department department=departmentService.get(1);
            Employee employee = new Employee();
            employee.setName("Tom");
            employee.setPermanent(true);
            employee.setSalary(new BigDecimal(15000));
            SimpleDateFormat sdf=new SimpleDateFormat("dd//MM/yyyy");
            try {
				Date dob=sdf.parse("02/07/2000");
				employee.setDateOfBirth(dob);
				employee.setDepartment(department);
				employeeService.save(employee);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
            

          // LOGGER.debug("Employee:{}", employee);

         // LOGGER.debug("Department:{}", employee.getDepartment());

            LOGGER.info("End");

  }
        
        private static void testUpdateEmployee() {
    		LOGGER.info("Start");
    		Employee employee = employeeService.get(5);
    		LOGGER.debug("Employee:{}", employee);
    		LOGGER.debug("Department:{}", employee.getDepartment());
    		employee.setDepartment(departmentService.get(2));
    		employeeService.save(employee);
    	}

    	private static void testgetDepartment() {
    		LOGGER.info("Start");
    		Department department = departmentService.get(3);
    		LOGGER.debug("Department:{}", department);
    		LOGGER.debug("Employee:{}", department.getEmployeeList());
    		LOGGER.info("End");

    	}

    	private static void testgetEmployee() {
    		LOGGER.info("Start");
    		Employee employee = employeeService.get(2);
    		LOGGER.debug("Employee:{}", employee);
    		LOGGER.debug("Department:{}", employee.getDepartment());
    		LOGGER.debug("Skill:{}", employee.getSkillList());
    		employeeService.save(employee);

    	}

    	private static void testAddSkillToEmployee() {
    		LOGGER.info("Start");
    		Employee employee = employeeService.get(1);
    		Skill skill = skillService.get(3);
    		employee.getSkillList().add(skill);

    		employeeService.save(employee);

    	}



}

/*
 * 
 * List<Stock> stockList=repository.findByStockCodeAndVolume("FB",
 * Sort.by("volume")); stockList.forEach(System.out::println);
 * 
 * 
 * List<Stock> stockList=repository.findByorderByVolumeDesc();
 * System.out.println(stockList.size());
 * 
 * 
 * 
 * //question 3 Pageable
 * pageable=PageRequest.of(0,3,Sort.by("volume").descending()); List<Stock>
 * stockList=repository.findThreeHighestVolumeStock(pageable);
 * stockList.forEach(System.out::println);
 * 
 * 
 */

//stockService=context.getBean(StockService.class);
// List<Stock> stockList=stockService.getAllStock("FB",9,2019);
// LOGGER.info("Stock: {}",stockList);

/*
 * private static CountryService service;
 * 
 * 
 * public static void main(String[] args) {
 * 
 * ApplicationContext context= SpringApplication.run(OrmLearnApplication.class,
 * args); LOGGER.info("Application Started.....");
 * service=context.getBean(CountryService.class);
 * 
 * testGetAllCountries(); testAddCountry(); testUpdateCountry();
 * testDeleteCountry(); }
 * 
 * public static void testGetAllCountries() { LOGGER.info("Start");
 * //List<Country> countryList=service.getAllCountries();
 * //LOGGER.info("Countries : {} ", countryList);
 * 
 * //try and catch because we have to handle countrynotfound exception try {
 * Country country=service.findCountryByCode("IN"); //Country
 * country=service.findCountryByCode("YY"); LOGGER.info("Country : {} ",
 * country);
 * 
 * } catch(CountryNotFoundException e) { LOGGER.error(e.getMessage()); }
 * LOGGER.info("End");
 * 
 * }
 * 
 * public static void testAddCountry() { LOGGER.info("Start"); Country
 * country=new Country("MM","New Country"); service.addCountry(country);
 * LOGGER.info("End");
 * 
 * }
 * 
 * public static void testUpdateCountry() { LOGGER.info("Start"); try {
 * service.updateCountry("MM","New Country Modified"); }
 * catch(CountryNotFoundException e) { LOGGER.error(e.getMessage()); }
 * LOGGER.info("End");
 * 
 * }
 * 
 * public static void testDeleteCountry() { LOGGER.info("Start");
 * service.deleteCountry("MM"); LOGGER.info("End"); }
 * 
 */
