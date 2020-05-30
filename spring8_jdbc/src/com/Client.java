package com;


import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		StudentDao d = (StudentDao)ctx.getBean("id1");
		Student st  = new Student(3,"Aman",15);
		//int status=d.save(st);
		//int status=d.saveDetails(st);
		//System.out.println(status);
	    //d.getAllStudent();
		d.getDetails();
		
	}
	
	
}
