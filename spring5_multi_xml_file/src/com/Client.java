package com;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;
public class Client {

	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("spconfig1.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Resource res1 = new ClassPathResource("spconfig2.xml");
		BeanFactory factory1 = new XmlBeanFactory(res1,factory);
		
		Traveller v1 = (Traveller)factory1.getBean("t");
        v1.startjourney();
	}
}
