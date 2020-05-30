package com.demo.firstproject.service;

import java.util.List;

import com.demo.firstproject.model.Employee;

public interface IEmployeeService {

	 List<Employee> getAllEmployee();
	 Employee getEmployeebyId(int id);
	void addEmployee(Employee emp);
	void updateEmployee(Employee emp, int empid);
	void deleteEmployee(Employee emp, int empid);
	
}
