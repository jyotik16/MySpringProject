package com;

public class Bike implements Vehicle{
	String Bname;
	String bike_num;
	

	public void setBname(String bname) {
		Bname = bname;
	}


	public void setBike_num(String bike_num) {
		this.bike_num = bike_num;
	}


	@Override
	public void move() {
		System.out.println("Dname:"+Bname+"  Bike _num:"+bike_num);
		
	}
}
