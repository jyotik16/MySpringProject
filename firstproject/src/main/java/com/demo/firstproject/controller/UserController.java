package com.demo.firstproject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.firstproject.model.Employee;
import com.demo.firstproject.service.IEmployeeService;

@RestController
public class UserController {
	@Autowired
	IEmployeeService empRef;
	
	@RequestMapping("/welcome")
	public String welcome() {		
		return "welcome";
	}
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee(){
		
		return (empRef.getAllEmployee());
	}

	@RequestMapping("/employees/{empid}")
	public Employee getEmployeebyId(@PathVariable int empid){
		
		return (empRef.getEmployeebyId(empid));
	}
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addEmployee(@RequestBody Employee Emp) {
		empRef.addEmployee(Emp);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{empid}")
	public void updateEmployee(@RequestBody Employee Emp,@PathVariable int empid) {
		empRef.updateEmployee(Emp,empid);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{empid}")
	public void deleteEmployee(@RequestBody Employee Emp,@PathVariable int empid) {
		empRef.deleteEmployee(Emp,empid);
	}
}
