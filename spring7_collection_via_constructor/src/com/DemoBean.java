package com;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DemoBean {

	private Set s;
	private Map<Integer,String> map;
	
	public DemoBean(Map<Integer, String> map) {
		super();
		this.map = map;
	}
	public DemoBean(Set s) {
		super();
		this.s = s;
	}
	public void show() {
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void show1() {
		
		Set ss = map.entrySet();
		Iterator itr =  ss.iterator();		
		while( itr.hasNext()) {			
			Map.Entry m1 = (Entry) itr.next();
			System.out.println(m1.getKey()+"->"+m1.getValue());
		}
	}
}
