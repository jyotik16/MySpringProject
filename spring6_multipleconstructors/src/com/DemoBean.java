package com;
public class DemoBean {
	
	
	private String message,username,password;
	
	public DemoBean(String message) {
		this.message=message;
		
	}
	
	public DemoBean(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	
	
	void display() {
		System.out.println(message+" "+username+" "+password);
		
	}

}