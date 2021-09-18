package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description="Employee class which is acting as the DTO")
public class Employee {

	
	private int id;
	@ApiModelProperty(notes="Name should contain only Alphabets")
	private String name;
	private String gender;
	@ApiModelProperty(notes="Age should be between 18 & 60")
	private int age;
	private double salary;
}
