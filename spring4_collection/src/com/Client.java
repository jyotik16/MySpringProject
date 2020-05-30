package com;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;


public class Client {
	
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Test t = (Test) factory.getBean("id1");
		t.show();
		
		
	}

}
