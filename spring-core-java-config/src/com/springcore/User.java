package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class User implements Users{

	//@Autowired
	private Employee emp;
	
	//constructor injection
	User(Employee Emp){
		this.emp =Emp;
	}
	
	@Override
	public void getUser() {
		System.out.println("Hello User");
		
	}
	@Override
	public void getEmp() {
		emp.getEmp();	
	}
	
	
	
}
