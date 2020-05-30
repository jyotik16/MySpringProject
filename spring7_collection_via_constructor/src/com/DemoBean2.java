package com;


import java.util.Iterator;
import java.util.List;


public class DemoBean2 {
	 List<Integer> numbers;

	public DemoBean2(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}
	 public void  show() {
//		   for (Integer i: numbers) 
//	            System.out.print(i + " "); //Error java.lang.String can;t to Java.lang.Integer
		   
		   Iterator it = numbers.iterator(); 
	        while (it.hasNext()) 
	            System.out.print(it.next() + " "); 
	    } 
	 } 
	 
//	private List<String> list;
//
//	public DemoBean2(List<String> list) {
//		super();
//		this.list = list;
//	}
//	
//	void show() {
//		for(String ll:list) {
//			System.out.println(ll+" ");
//		}
//	}
//}
