package com;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;

public class Client {
	
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("spconfig.xml");
		
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object obj=factory.getBean("id1");
		Test t =(Test)obj;
		Test t1 = (Test)obj;
		System.out.println(t==t1);
		t.show();
		
	}

}
