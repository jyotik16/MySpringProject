package com.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		User u = (User) context.getBean("myUser");
		u.getUser();
		u.getEmp();
		context.close();
	}
	
}
