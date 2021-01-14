package com.junitexample.services;

import com.junitexample.model.Employee;

//Interface to get employee
public interface EmployeeService {
	
	Employee getEmployee(String id);
}
