package com;


import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;


public class Client {

	
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		DemoBean db = (DemoBean)factory.getBean("id1");
		db.display();  //Welcome to NewYork  null null
		
		DemoBean db1 = (DemoBean)factory.getBean("id2");
		db1.display(); //null Ankita @123
		
	}
	
}
