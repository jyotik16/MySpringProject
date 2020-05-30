package com;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	private Map<Integer,String> map;
	
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	
	
	public void show() {
		
		Set ss = map.entrySet();
		Iterator itr =  ss.iterator();		
		while( itr.hasNext()) {			
			Map.Entry m1 = (Entry) itr.next();
			System.out.println(m1.getKey()+"->"+m1.getValue());
		}
	}
	/*private Set s;

	public void setS(Set s) {
		this.s = s;
	}
	
	public void show() {
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}*/

	




}
