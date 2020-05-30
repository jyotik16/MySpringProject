package com;

public class Car implements Vehicle{

	String dname;
	String car_num;
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}
	
	@Override
	public void move() {
		System.out.println("Dname:"+dname+"  car_num:"+car_num);
		
	}
}
