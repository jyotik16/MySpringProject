package com;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;


public class Client2 {
	
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("spconfig2.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		DemoBean2 t = (DemoBean2) factory.getBean("id2");
		t.show(); //ABC		EFG 		XYZ
		
		DemoBean2 t1 = (DemoBean2) factory.getBean("id2");
		t1.show(); //5000 4000 1000 5000 4000 1000 
	}

}

