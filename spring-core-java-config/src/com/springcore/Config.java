package com.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore")
public class Config {
	
	@Bean(name="myUser")
	public User getUser() {
		User u = new User(getEmp());
		return u;
	}
	
	@Bean(name="myEmp")
	public EmpImpl getEmp() {
		return new EmpImpl();
	}
}
