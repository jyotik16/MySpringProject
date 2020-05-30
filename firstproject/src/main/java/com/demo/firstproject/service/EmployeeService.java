package com.demo.firstproject.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.firstproject.model.Employee;
@Service
public class EmployeeService implements IEmployeeService {

	List<Employee> emplist = new ArrayList<>(Arrays.asList(
			new Employee(1,"Rohan"),
			new Employee(2,"Akshit"),
			new Employee(3,"Arnav")
			));

	@Override
	public List<Employee> getAllEmployee() {
		return emplist;
	}
	@Override
	public Employee getEmployeebyId(int id) {
		return emplist.stream().filter(e->e.getId() == id ).findFirst().get();
	}
	@Override
	public void addEmployee(Employee emp) {
		emplist.add(emp);		
	}
	@Override
	public void updateEmployee(Employee emp, int empid) {
		
		for(int i=0;i<emplist.size();i++) {
			Employee e = emplist.get(i);
			if(e.getId() == empid) {
				emplist.set(i, emp);
				return;
			}	
		}
	}
	@Override
	public void deleteEmployee(Employee emp, int empid) {
		
		//emplist.removeIf(e->e.getId() == empid);
		Employee e = emplist.get(empid);
		emplist.remove(e);
	}
}
