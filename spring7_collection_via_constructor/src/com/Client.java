package com;
import org.springframework.core.io.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;


public class Client {
	
	public static void main(String[] args) {
		
		Resource res = new ClassPathResource("spconfig.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		DemoBean t = (DemoBean) factory.getBean("id1");
		t.show(); //Aman 	101 		MN2
		
		DemoBean t1 = (DemoBean) factory.getBean("id2");
		t1.show1(); //1->Aman 		2->Anu		3->Avni		4->Arjun
		
	}

}

