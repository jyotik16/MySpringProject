package com;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;


public class Client {
public static void main(String[] args) {
	
	Resource res = new ClassPathResource("spconfig.xml");
	BeanFactory factory = new XmlBeanFactory(res);
	
	SampleBean sp=(SampleBean)factory.getBean("id1");
	sp.show();
	
	ExampleBean ep=(ExampleBean)factory.getBean("id2");
	ep.show1();
	
	DemoBean db1 = (DemoBean)factory.getBean("id3");
	System.out.println(db1);
	
}
}

/*
com.DemoBean@39ed3c8d
In Demobean 
com.DemoBean@123772c4
In Demobean 

container create two object 
We have two different object formed for demoBean
============================
com.DemoBean@762efe5d
In Demobean 
com.DemoBean@762efe5d
In Demobean 
com.DemoBean@762efe5d

Now container make only one object and pass other two classes.
*/