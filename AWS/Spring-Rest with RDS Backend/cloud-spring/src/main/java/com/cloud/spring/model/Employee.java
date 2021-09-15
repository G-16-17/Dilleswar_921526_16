package com.cloud.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	private String uname;
	private String gender;
	private int age;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public Employee(int id, String uname, String gender, int age, double salary) {
		super();
		this.id = id;
		this.uname = uname;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
