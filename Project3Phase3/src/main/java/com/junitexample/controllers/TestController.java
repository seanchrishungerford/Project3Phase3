package com.junitexample.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.junitexample.model.Employee;
import com.junitexample.services.EmployeeService;

//Rest controller
@RestController
public class TestController {
	
	private EmployeeService employeeService;
	
	
	public TestController(EmployeeService employeeService) {
		this.employeeService =  employeeService;
	}

	//Create a request mapping for employee ID
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
	public Employee firstPage(@PathVariable String id) {
		
		return employeeService.getEmployee(id);
	}

}
